package com.talkingdata.sdmk;

import com.sun.javafx.binding.StringFormatter;
import org.springframework.context.annotation.Bean;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/**
 * User：    ysl
 * Date:   2017/7/10
 * Time:   11:13
 */
public class Test {


    public static void main(String[] args){

        int n = 1;
        System.out.println();

    }






    public static void test1(){
        SoftReference<String> bean = new SoftReference<String>("sssss");
        System.out.println(bean.get());// get()方法获取对应对象的强引用从而访问目标对象

        //虚引用主要用于跟踪对象被垃圾回收的状态
        ReferenceQueue<String> refQueue = new ReferenceQueue<String>();
        PhantomReference<String> referent = new PhantomReference<String>(
                new String("T"), refQueue);
        System.out.println(referent.get());// null

        System.gc();
        System.runFinalization();

        System.out.println(refQueue.poll() == referent); //true

        HashMap<String,String>  paramsMap = new HashMap<>();
        System.out.println(1<<30);

        long num = 123456788l;
        System.out.println(new DecimalFormat(",###").format(num));
    }



}
