package com.amptester;

import com.amptester.spider.Spider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class NewrelicApplication {
    public static void run(String[] args) {
        SpringApplication application = new SpringApplication(ApmTesterApplication.class);
        application.run(args);
        new Spider().run();
    }

    public static void main(String[] args) {
        run(args);
    }
}
