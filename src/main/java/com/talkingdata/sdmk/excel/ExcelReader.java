package com.talkingdata.sdmk.excel;

import com.talkingdata.sdmk.util.MyUtils;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExcelReader {
    private String filePath;
    private String sheetName;
    private Workbook workBook;
    private Sheet sheet;
    private List<String> columnHeaderList;
    private List<List<String>> listData;
    private List<Map<String,String>> mapData;
    private boolean flag;

    public ExcelReader(String filePath, String sheetName) {
        this.filePath = filePath;
        this.sheetName = sheetName;
        this.flag = false;
        this.load();
    }    

    private void load() {
        FileInputStream inStream = null;
        try {
            inStream = new FileInputStream(new File(filePath));
            workBook = WorkbookFactory.create(inStream);
            sheet = workBook.getSheet(sheetName);            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(inStream!=null){
                    inStream.close();
                }                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getCellValue(Cell cell) {
        String cellValue = "";
        DataFormatter formatter = new DataFormatter();
        if (cell != null) {
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = formatter.formatCellValue(cell);
                    } else {
                        double value = cell.getNumericCellValue();
                        int intValue = (int) value;
                        cellValue = value - intValue == 0 ? String.valueOf(intValue) : String.valueOf(value);
                    }
                    break;
                case Cell.CELL_TYPE_STRING:
                    cellValue = cell.getStringCellValue();
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue());
                    break;
                case Cell.CELL_TYPE_FORMULA:
                    cellValue = String.valueOf(cell.getCellFormula());
                    break;
                case Cell.CELL_TYPE_BLANK:
                    cellValue = "";
                    break;
                case Cell.CELL_TYPE_ERROR:
                    cellValue = "";
                    break;
                default:
                    cellValue = cell.toString().trim();
                    break;
            }
        }
        return cellValue.trim();
    }

    private void getSheetData() {
        listData = new ArrayList<List<String>>();
        mapData = new ArrayList<Map<String, String>>();
        columnHeaderList = new ArrayList<String>();
        int numOfRows = sheet.getLastRowNum() + 1;
        for (int i = 0; i < numOfRows; i++) {
            Row row = sheet.getRow(i);
            Map<String, String> map = new HashMap<String, String>();
            List<String> list = new ArrayList<String>();
            if (row != null) {
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    if (i == 0){
                        columnHeaderList.add(getCellValue(cell));
                    }
                    else{                        
                        map.put(columnHeaderList.get(j), this.getCellValue(cell));
                    }
                    list.add(this.getCellValue(cell));
                }
            }
            if (i > 0){
                mapData.add(map);
            }
            listData.add(list);
        }
        flag = true;
    }
    
    public String getCellData(int row, int col){
        if(row<=0 || col<=0){
            return null;
        }
        if(!flag){
            this.getSheetData();
        }        
        if(listData.size()>=row && listData.get(row-1).size()>=col){
            return listData.get(row-1).get(col-1);
        }else{
            return null;
        }
    }
    
    public String getCellData(int row, String headerName){
        if(row<=0){
            return null;
        }
        if(!flag){
            this.getSheetData();
        }        
        if(mapData.size()>=row && mapData.get(row-1).containsKey(headerName)){
            return mapData.get(row-1).get(headerName);
        }else{
            return null;
        }
    }



    public static void   readExcel()
    {
        //String url = "http://172.20.33.1:8095/serviceGroup/addServiceGroups";
        String url = "http://172.22.9.2:8095/serviceGroup/addServiceGroups";
        List<Map<String,String>> mapList = new ArrayList<>();
        ExcelReader eh = new ExcelReader("I:\\公司\\数据服务列表\\DTU内部服务列表_20170615.xlsx","Sheet1");
        for (int i=1;i<112;i++)
        {
            System.out.println(eh.getCellData(i, "服务名称") + " --" + eh.getCellData(i, "serviceID"));
            Map<String,String> map = new ConcurrentHashMap<>();
            map.put("serviceName",eh.getCellData(i, "服务名称"));
            map.put("serviceId",eh.getCellData(i, "serviceID"));
            map.put("groupIds", "2");
            MyUtils.doPost(url,map,"UTF-8");
        }
    }

    public static void main(String[] args) {
       /* ExcelReader eh = new ExcelReader("I:\\公司\\数据服务列表\\DTU内部服务列表_20170615.xlsx","Sheet1");
        System.out.println(eh.getCellData(1, 1));
        System.out.println(eh.getCellData(2, "服务名称"));*/

        readExcel();
/*        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("serviceName","金融标签查询服务");
        map.put("serviceId","8420ed30ae524d11859d69941e5092a8");
        map.put("groupIds", "1");
        String url = "http://172.22.9.2:8095/serviceGroup/addServiceGroups";
        MyUtils.doPost(url,map,"UTF-8");*/
    }
}