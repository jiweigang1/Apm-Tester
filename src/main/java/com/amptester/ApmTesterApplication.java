package com.amptester;

import com.amptester.spider.Spider;
import org.springframework.boot.SpringApplication;

public class ApmTesterApplication {
    public static void run(String[] args) {
        SpringApplication application = new SpringApplication(ApmTesterApplication.class);
        application.run(args);
        new Spider().run();
    }
}
