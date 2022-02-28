package com.amptester.controller;

import com.bean.BigObject;
import com.bean.CustomCache;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/structures/")
public class CustomMemoryStructures {
    
    static CustomCache  customCache = new CustomCache();

    @RequestMapping("/customMemoryStructures")
    public String customMemoryStructures(){
        for(int i=0;i < 100; i++){
            customCache.add(new BigObject());
        }
        return "customMemoryStructures-ok " + customCache.size();
    }
}
