package com.talkingdata.sdmk.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.hbase
 * @Description: 连接Hbase的配置
 * @date 2018/6/13 18:01
 * @email 1242157902@qq.com
 */
public class HbaseConfiguration {

    private static  Connection conn;
    private static final String port = "2181";
    private static final String zookeeperQuorum = "172.23.5.145,172.23.5.168,172.23.5.169";
    static Configuration config = null;
    static {
        config = HBaseConfiguration.create();
        config.set("hbase.zookeeper.quorum", zookeeperQuorum);
        config.set("hbase.zookeeper.property.clientPort", port);
        try {
            conn = ConnectionFactory.createConnection(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取zookeeper 的配置
     * @return
     */
    public static Configuration getConfig(){
        return config;
    }


    /**
     * 获取Hbase的Connection
     * @return      :返回connection
     */
    public static Connection getConnection(){
        return conn;
    }

    public static void closeConnection(){
        if(null != conn){
            try {
                conn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
