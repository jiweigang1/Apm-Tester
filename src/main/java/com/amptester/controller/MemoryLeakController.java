package com.amptester.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memory/")
public class MemoryLeakController {
    @RequestMapping("/memoryLeak")
    public String  memoryLeak(){

      return "ok";
    }
}
