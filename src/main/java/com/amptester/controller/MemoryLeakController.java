package com.amptester.controller;
import java.util.ArrayList;
import java.util.List;

import com.bean.BigObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memory/")
public class MemoryLeakController {
   public boolean run = false;
   static List  datas =  new ArrayList<>();
   static{
     for(int i=0; i<1000; i++ ){
        datas.add(new BigObject());
     }
   }

    @RequestMapping("/memoryLeak")
    public String  memoryLeak(){
      if(this.run){
        for(int i=0; i<1024; i++ ){
          datas.add(new BigObject());
      }
      }
      return "memoryLeak-ok " + datas.size();
    }

    @RequestMapping("/start")
    public boolean  start(@RequestParam("start") boolean start){
      this.run = start;
      return  this.run;
    }
    @RequestMapping("/state")
    public boolean  state(){
      return  this.run;
    }
}
