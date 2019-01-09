package com.talkingdata.test.testclient;
import com.talkingdata.sdmk.Application;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public abstract  class AbstractTestSuite {

    private static final Logger log = LoggerFactory.getLogger(AbstractTestSuite.class);

    @Rule
    // 这里注意，使用@Rule注解必须要用public
    public OutputCapture capture = new OutputCapture();



    /**
     * use test  environment data ;
     */

    public static  final  String SERVICE_ID = "b74d0dfa563846fb99157e7e68197028";


}
