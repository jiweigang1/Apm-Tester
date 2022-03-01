package com.amptester;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Appdynamics {
    public static void main(String[] args) {
        ApmTesterApplication.run(args);
    }
}
