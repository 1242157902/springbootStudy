package com.talkingdata.sdmk.histrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.histrix
 * @Description: Hystrix的简单案例
 * @date 2018/9/27 16:50
 * @email 1242157902@qq.com
 */
public class HelloWorldHystrixCommand extends HystrixCommand<String> {

    private final String name ;

    protected HelloWorldHystrixCommand(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        System.out.println("thread: " + Thread.currentThread().getName());
        return "hello" + name;
    }

    public static void main(String[] args) {
        String result = new HelloWorldHystrixCommand("test").execute();
        System.out.println(result);
    }
}
