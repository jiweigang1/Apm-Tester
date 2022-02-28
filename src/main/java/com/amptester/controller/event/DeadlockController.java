package com.amptester.controller.event;

import com.bean.DeadLock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadlock/")
public class DeadlockController {
    
    @RequestMapping("/lock")
    public String lock(){
        DeadLock.lock();
        return "lock";
    }
}
