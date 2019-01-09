package com.talkingdata.sdmk.Service;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * User：    ysl
 * Date:   2017/6/27
 * Time:   11:38
 */

@Service
public class RestClientService {

    private Logger log = LoggerFactory.getLogger(RestClientService.class);

/*    @Autowired
    private RestTemplate restTemplate;*/
        RestTemplate restTemplate = new RestTemplate();

    public String doGetAndSetHeader(String url, Map<String, String> queryParams,Map<String,String> headerParams)
            throws ClientProtocolException, IOException, URISyntaxException
    {

        HttpHeaders headers = new HttpHeaders();
        for (Map.Entry<String,String> entry:headerParams.entrySet())
        {
            headers.set(entry.getKey(),entry.getValue());
        }

        URIBuilder uriBuilder = new URIBuilder(url);
        if(null != queryParams){
            for (String key : queryParams.keySet()) {
                uriBuilder.addParameter(key, queryParams.get(key));
            }
        }
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(uriBuilder.toString(), HttpMethod.GET, requestEntity, String.class);
        if(response.getStatusCode().equals(HttpStatus.OK)){
            return response.getBody();
        }else{
            log.info("status:{},repsonse:{}",response.toString());
        }
        return null;
    }


    public void sendPost(String url, MultiValueMap<String, String> params)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        if(response.getStatusCode().equals(HttpStatus.OK)){
            log.info("post success!");
        }else{
            log.info("status:{},repsonse:{}",response.toString());
        }
    }
}
