package com.talkingdata.sdmk.controller;


import com.talkingdata.sdmk.pojo.User;
import com.talkingdata.sdmk.util.JWTUtils;
import com.talkingdata.sdmk.util.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
  
@Controller  
@RequestMapping("/me")  
public class MeController {  
  
    @GetMapping("/get_info")  
    @ResponseBody  
    public ResponseData getInfo(@RequestParam String token) {
        User user = JWTUtils.unsign(token, User.class);
        if (user != null) {  
            return ResponseData.ok().putDataValue("user", user);  
        }  
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "token不合法" });  
    }  
}  