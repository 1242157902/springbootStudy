package com.talkingdata.sdmk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * User：    ysl
 * Date:   2017/5/29
 * Time:   10:28
 */
@SpringBootApplication
public class Application  extends SpringBootServletInitializer {





    private static Class<Application> applicationClass = Application.class;

   public static void main(String[] args) throws Exception {
        SpringApplication.run(applicationClass, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(applicationClass);
    }
}
