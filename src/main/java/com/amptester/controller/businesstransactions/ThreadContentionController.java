package com.amptester.controller.businesstransactions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threadContention/")
public class ThreadContentionController {
    @RequestMapping("/sleep")
    public String lock(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return "sleep- ok";
    }
}
