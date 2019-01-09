package com.talkingdata.sdmk.controller;

import com.talkingdata.sdmk.Service.RestClientService;
import com.talkingdata.sdmk.pojo.TestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User：    ysl
 * Date:   2017/5/28
 * Time:   22:33
 */
@RestController
@RequestMapping("/test")
public class SampleController {




    @RequestMapping("/index1")
    public TestEntity index1() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestEntity testEntity = new TestEntity("500ms");
        return testEntity;
    }

    @RequestMapping("/index2")
    public TestEntity index2() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestEntity testEntity = new TestEntity("1s");
        return testEntity;
    }

    @RequestMapping("/index3")
    public TestEntity index3() {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestEntity testEntity = new TestEntity("1500ms");
        return testEntity;
    }

    @RequestMapping("/index4")
    public TestEntity index4() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestEntity testEntity = new TestEntity("2s");
        return testEntity;
    }


    @RequestMapping("/index5")
    public TestEntity index5() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TestEntity testEntity = new TestEntity("2500ms");
        return testEntity;
    }


    @RequestMapping("/index6")
    public TestEntity index6() {


        TestEntity testEntity = new TestEntity("3000ms");
        return testEntity;
    }



}
