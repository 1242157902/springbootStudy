package com.talkingdata.sdmk.collections;

import sun.misc.Unsafe;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.collections
 * @Description: HashMap原理性学习
 * @date 2018/7/30 10:40
 * @email 1242157902@qq.com
 */
public class HashMapTest {


    public static void main(String[] args)throws Exception{

        HashMap<String,Integer> map = new HashMap<>();
        map.put("dd",1);
        Integer result = map.get("dd");

        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("dddd",23);
        concurrentHashMap.get("dddd");
    }
}
