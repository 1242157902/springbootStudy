package com.talkingdata.sdmk.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Component
public class MyUtils {


    private static final Logger logger = LoggerFactory.getLogger(MyUtils.class);


    /**
     * 作用：微信报警服务
     * @param msg
     * @return
     * @throws Exception
     */
    public   String doHttpGet(String msg)throws Exception{
        //短信接口
       // String url = "http://alarm.tendcloud.com:9000/sendalart?severity=1&msg='故障信息'&phones=15650725379,13611101581,17051019828,1565071968,15901440304,18518385505";
        //微信接口
        String url = "http://alarm.tendcloud.com:9000/sendalart?severity=4&" +
                "msg=" + msg +
                "&phones=15650725379,13611101581,17051019828,15650719638,15901440304,18518385505" +
                "&subject=Kestrel淤积";
        //邮件
        //String url = "http://alarm.tendcloud.com:9000/sendalart?severity=3&msg=故障信息!!!&emails=shuangliang.yang&subject=Kestrel淤积";
        String response_json = null;
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);
        getRequest.addHeader("accept", "application/json");
        HttpResponse response = httpClient.execute(getRequest);

        if (response.getStatusLine().getStatusCode() != 200)
        {
            logger.info("send message ：{},send message success!",msg);
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatusLine().getStatusCode());
        }
        //response_json = IOUtils.toString(response.getEntity().getContent());
        httpClient.getConnectionManager().shutdown();
        return response_json;
    }



    public static String doPost(String url,Map<String,String> map,String charset){
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try{
           HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
            httpClient = httpClientBuilder.build();
            httpPost = new HttpPost(url);
            //设置参数
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String,String> elem = (Map.Entry<String, String>) iterator.next();
                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));
            }
            if(list.size() > 0){
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);
                httpPost.setEntity(entity);
            }
            HttpResponse response = httpClient.execute(httpPost);
            if(response != null){
                HttpEntity resEntity = response.getEntity();
                if(resEntity != null){
                    result = EntityUtils.toString(resEntity, charset);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }





    public static void main(String[] args)throws Exception
    {
        MyUtils myUtils = new MyUtils();
        String msg = "服务名称：596062b4afbd4d38887e31bbbb92f1b7错误数：4";
        myUtils.doHttpGet(msg);
    }

}
