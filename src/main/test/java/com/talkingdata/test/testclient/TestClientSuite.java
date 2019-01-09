package com.talkingdata.test.testclient;

import com.talkingdata.sdmk.Service.RestClientService;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User：    ysl
 * Date:   2018/1/4
 * Time:   16:30
 */
public class TestClientSuite  {




    public static void main(String[] args)throws Exception{
        RestClientService restClientService = new RestClientService();
        //
         //String url = "http://172.20.33.3:9000/data/user-tag-gamedeepness/v2?id=tdidss&type=tdid";
        String url = "http://it.dmk.tendcloud.com/data/user-tag-gamedeepness/v5?id=dsfdas&type=tdid";
         Map<String,String> headerParams = new HashMap<>();
         headerParams.put("X-Access-Token", "d46cf1d72f9546a6a0fabcc1a2cae904-bingxin.li@tendcloud.com");

        for (int j=0;j<100;j++){
            for (int i=0;i<10;i++){
                String result = null;
                try {
                    result = restClientService.doGetAndSetHeader(url,null,headerParams);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                System.out.println(result);
            }
            Thread.sleep(2000);
        }
    }


}
