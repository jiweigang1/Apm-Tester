package com.amptester;

import com.amptester.spider.Spider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ApmTesterApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApmTesterApplication.class);
        application.run(args);
        new Spider().run();
    }
}
