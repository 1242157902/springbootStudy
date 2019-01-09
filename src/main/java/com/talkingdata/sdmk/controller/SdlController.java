package com.talkingdata.sdmk.controller;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.controller
 * @Description: ${todo}
 * @date 2018/5/16 11:19
 * @email 1242157902@qq.com
 */
@Controller
@RequestMapping("/sdl")
public class SdlController {



    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    @ResponseBody
    public void login(@RequestParam String userEmail,HttpServletRequest request,HttpServletResponse httpServletResponse) throws Exception{
        String url = "http://debug.dmk.tendcloud.com/sdladaptor/explore/redirect1";
        url = url + "?userEmail=" + userEmail;
        DefaultHttpClient httpClient = null;
        HttpGet httpPost = null;
        String result = null;
        HttpResponse response = null;
        try {
            httpClient = new DefaultHttpClient();
            httpPost = new HttpGet(url);

            response = httpClient.execute(httpPost);
            System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(EntityUtils.toString(response.getEntity(),"UTF-8"));
            String JSESSIONID = null;
            String cookie_user = null;
            //获得Cookies
            CookieStore cookieStore = httpClient.getCookieStore();
            List<Cookie> cookies = cookieStore.getCookies();
            for (int i = 0; i < cookies.size(); i++) {
                Cookie cookie = cookies.get(i);
                //遍历Cookies
                System.out.println(cookies.get(i));
                System.out.println("cookiename=="+cookies.get(i).getName());
                System.out.println("cookieValue=="+cookies.get(i).getValue());
                System.out.println("Domain=="+cookies.get(i).getDomain());
                System.out.println("Path=="+cookies.get(i).getPath());
                System.out.println("Version=="+cookies.get(i).getVersion());
                String path = cookies.get(i).getPath();
                String domain = cookies.get(i).getDomain();
                String cookieValue = cookies.get(i).getDomain();
                javax.servlet.http.Cookie cookie1 = new javax.servlet.http.Cookie(cookie.getName(), cookie.getValue());
                cookie1.setMaxAge(60 * 60 * 24 * 7);// 设置为7天
                cookie1.setPath("/");
                cookie1.setDomain(cookie.getDomain());
                httpServletResponse.addCookie(cookie1);
            }
            if (cookie_user != null) {
                result = JSESSIONID;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
