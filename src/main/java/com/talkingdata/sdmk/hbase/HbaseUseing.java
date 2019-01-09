package com.talkingdata.sdmk.hbase;

import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.hbase
 * @Description: Hbase的常用用法：增删改查表
 * @date 2018/6/13 18:08
 * @email 1242157902@qq.com
 */
public class HbaseUseing {


    public static void main(String[] args)throws Exception{
        //创建表
       // createTable("ysl", new String[]{"c1","c2"});
     /*   for (int i =0 ;i<100;i++){
            insertData("ysl","1231" + i,"c1","name","杨双亮");
        }*/
       // queryByRowKey("ysl","123");
        //updateTable("ysl", "123", "c1", "name", "ysl");
        //queryByRowKey("ysl", "123");
        //deleteData("ysl", "123");
       // queryColumn("ysl", "123","c1","name");
        //queryAll("ysl");
       // staticByFilter("ysl",new ArrayList<>()[""]);
        HbaseConfiguration.closeConnection();
    }


    /**
     * 查询文件
     * @param strTableName
     * @param rowKey
     * @param family
     * @param qualifier
     * @param path
     */
    public static void queryFile(String strTableName, String rowKey, String family,
                                 String qualifier, String path){
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        Connection connection = HbaseConfiguration.getConnection();
        Table table = null;
        TableName tableName = TableName.valueOf(strTableName);
        try {
            table = connection.getTable(tableName);
            Get get = new Get(Bytes.toBytes(rowKey));
            get.addColumn(Bytes.toBytes(family),Bytes.toBytes(qualifier));
            Result result = table.get(get);
            for(Cell cell : result.rawCells()){
                byte[] buffer = CellUtil.cloneValue(cell);
                file = new File(path);
                fos = new FileOutputStream(file);
                bos = new BufferedOutputStream(fos);
                bos.write(buffer);
                System.out.println(path + " 文件获取成功！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (table != null) {
                    table.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 将文件存入HBASE表中，文件为二进制数组
     * @param strTableName
     * @param rowKey
     * @param family
     * @param qualifier
     * @param file
     */
    public static  void saveFile(String strTableName, String rowKey, String family,
                         String qualifier, byte[] file){
        Connection connection = HbaseConfiguration.getConnection();
        Table table = null;
        TableName tableName = TableName.valueOf(strTableName);
        try {
            table = connection.getTable(tableName);
            Put put = new Put(Bytes.toBytes(rowKey));
            put.add(Bytes.toBytes(family),Bytes.toBytes(qualifier),file);
            table.put(put);
            System.out.println("文件存储成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 过滤器查询
     * @param strTableName
     * @param arr
     */
    public static void staticByFilter(String strTableName,List<String> arr){
        Connection connection = HbaseConfiguration.getConnection();
        Table table = null;
        TableName tableName = TableName.valueOf(strTableName);
        try {
            table = connection.getTable(tableName);
            FilterList filterList = new FilterList(
                    FilterList.Operator.MUST_PASS_ONE       //各条件时or 的关系，默认是And
            );
            Scan scan = new Scan();
            for(String v : arr){
                String[] s = v.split(",");
                filterList.addFilter(new SingleColumnValueFilter(Bytes
                        .toBytes(s[0]),Bytes.toBytes(s[1]), CompareFilter.CompareOp.EQUAL,Bytes.toBytes(s[2])));
            }
            scan.setFilter(filterList);
            ResultScanner rs = table.getScanner(scan);
            for (Result result : rs) {
                for (Cell cell : result.rawCells()) {
                    System.out.println("列族："
                            + Bytes.toString(CellUtil.cloneFamily(cell)));
                    System.out.println("列名： "
                            + Bytes.toString(CellUtil.cloneQualifier(cell)));
                    System.out.println("列值： "
                            + Bytes.toString(CellUtil.cloneValue(cell)));
                    System.out.println("行名： "
                            + Bytes.toString(CellUtil.cloneRow(cell)));
                    System.out.println("时间戳： " + cell.getTimestamp());
                    System.out.println("-----------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 查询该表的所有数据
     * @param strTableName
     */
    public static  void  queryAll(String strTableName){
        Connection connection = HbaseConfiguration.getConnection();
        Table table = null;
        TableName tableName = TableName.valueOf(strTableName);
        try {
            table = connection.getTable(tableName);
            Scan scan = new Scan(); //创建Scan
            //scan.setStartRow("r0".getBytes());//添加开始rowkey
            //scan.setStopRow("r5".getBytes());//结束rowkey
            ResultScanner resultScanner = table.getScanner(scan);
            //两种方式
            //1.
            for(Result row : resultScanner){
                System.out.println("\nRowkey: " + new String(row.getRow()));
                for (Cell cell : row.rawCells()) { // 循环指定行、全部列族的全部列
                    System.out.println("列族："
                            + Bytes.toString(CellUtil.cloneFamily(cell)));
                    System.out.println("列名： "
                            + Bytes.toString(CellUtil.cloneQualifier(cell)));
                    System.out.println("列值： "
                            + Bytes.toString(CellUtil.cloneValue(cell)));
                    System.out.println("行名： "
                            + Bytes.toString(CellUtil.cloneRow(cell)));
                    System.out.println("时间戳： " + cell.getTimestamp());
                    System.out.println("-----------------------------");
                }
            }
            //2.
            Iterator<Result> results = resultScanner.iterator();
            while(results.hasNext()){
                Result result = results.next();
                List<Cell> cells =  result.listCells();
                for (Cell cell : cells) { // 循环指定行、全部列族的全部列
                    System.out.println("列族："
                            + Bytes.toString(CellUtil.cloneFamily(cell)));
                    System.out.println("列名： "
                            + Bytes.toString(CellUtil.cloneQualifier(cell)));
                    System.out.println("列值： "
                            + Bytes.toString(CellUtil.cloneValue(cell)));
                    System.out.println("行名： "
                            + Bytes.toString(CellUtil.cloneRow(cell)));
                    System.out.println("时间戳： " + cell.getTimestamp());
                    System.out.println("-----------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //创建表
    public static void createTable(String strTableNameStr, String[] families) throws IllegalArgumentException, IOException {
        Admin admin = null;
        try {
            admin = HbaseConfiguration.getConnection().getAdmin();
            TableName tableName = TableName.valueOf(strTableNameStr);
            if(admin.tableExists(tableName)){
                System.out.println(tableName + "表已经存在");
            }else{
                HTableDescriptor desc = new HTableDescriptor(tableName);
                for (int i = 0; i < families.length; i++) {
                    HColumnDescriptor family = new HColumnDescriptor(families[i]);
                    desc.addFamily(family);
                }
                admin.createTable(desc);//创建表
                System.out.println("创建表 \'" + tableName + "\' 成功!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(null != admin){
                admin.close();
            }
        }
    }


    /**
     * 添加数据
     * @param strTableName
     * @param rowKey
     * @param family
     * @param qualifier
     * @param value
     */
    public static void insertData(String strTableName, String rowKey, String family,
                                  String qualifier, String value) {
        Connection connection = HbaseConfiguration.getConnection();
        Table table = null;
        try {
            TableName tableName = TableName.valueOf(strTableName);
            table = connection.getTable(tableName);
            Put put = new Put(Bytes.toBytes(rowKey));
            put.add(Bytes.toBytes(family),Bytes.toBytes(qualifier),Bytes.toBytes(value));
            table.put(put);
        /*
         * // 批量插入 List<Put> list = new ArrayList<Put>(); Put put = new
         * Put(Bytes.toBytes(rowKey));//获取put，用于插入
         * put.add(Bytes.toBytes(family),
         * Bytes.toBytes(qualifier),Bytes.toBytes(value));//封装信息
         * list.add(put); table.put(list);//添加记录
         */
            System.out.println("插入记录成功！");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(null != table){
                    table.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     *通过rowKey查询数据
     * @param strTableName
     * @param rowKey
     */
    public static void queryByRowKey(String strTableName,String rowKey) {
        Connection connection = HbaseConfiguration.getConnection();
        Table  table = null;
        try {
            table = connection.getTable(TableName.valueOf(strTableName));
            Get get = new Get(rowKey.getBytes());   //创建行记录
            Result row = table.get(get);    //获取行记录
            for (Cell cell : row.rawCells()) { // 循环指定行、全部列族的全部列
                System.out.println("列族："
                        + Bytes.toString(CellUtil.cloneFamily(cell)));
                System.out.println("列名： "
                        + Bytes.toString(CellUtil.cloneQualifier(cell)));
                System.out.println("列值： "
                        + Bytes.toString(CellUtil.cloneValue(cell)));
                System.out.println("行名： "
                        + Bytes.toString(CellUtil.cloneRow(cell)));
                System.out.println("时间戳： " + cell.getTimestamp());
                System.out.println("-----------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 更新表中某一行，某一列
     * @param strTableName
     * @param rowKey
     * @param family
     * @param qualifier
     * @param newValue
     */
    public static void updateTable(String strTableName, String rowKey, String family,
                            String qualifier, String newValue){
        Connection connection = HbaseConfiguration.getConnection();
        Table  table = null;
        try {
            table = connection.getTable(TableName.valueOf(strTableName));
            Put put = new Put(Bytes.toBytes(rowKey));
            //仍热是插入操作
            put.add(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(newValue));
            table.put(put);
            System.out.println("更新成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 删除表中某个rowKey的数据
     * @param strTableName
     * @param rowKey
     */
    public static  void deleteData(String strTableName,String rowKey){
        Connection connection = HbaseConfiguration.getConnection();
        Table  table = null;
        try {
            table = connection.getTable(TableName.valueOf(strTableName));
            Delete del = new Delete(Bytes.toBytes(rowKey));
            table.delete(del);
            System.out.println("删除记录成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * 查询数据
     * @param strTableName
     * @param rowKey
     * @param family
     * @param qualifier
     */
    public static void queryColumn(String strTableName,String rowKey,String family,String qualifier){
        Connection connection = HbaseConfiguration.getConnection();
        Table  table = null;
        try {
            table = connection.getTable(TableName.valueOf(strTableName));
            Get get = new Get(Bytes.toBytes(rowKey));
            get.addColumn(Bytes.toBytes(family),Bytes.toBytes(qualifier));
            Result result = table.get(get);
            for(Cell cell: result.rawCells()){
                System.out.println("列族： "
                        + Bytes.toString(CellUtil.cloneFamily(cell)) );
                System.out.println("列名： "
                        + Bytes.toString(CellUtil.cloneQualifier(cell)) );
                System.out.println("列值： "
                        + Bytes.toString(CellUtil.cloneValue(cell)) );
                System.out.println("行名： "
                        + Bytes.toString(CellUtil.cloneRow(cell)) );
                System.out.println("时间戳： "
                        + cell.getTimestamp() );
                System.out.println("-----------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != table){
                    table.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
