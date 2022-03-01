package com.amptester.controller.businesstransactions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/threadContention/")
public class ThreadContentionController {
    @RequestMapping("/sleep")
    public String lock(){
        final Lock lock = new ReentrantLock();
        new Thread(){
            @Override
            public void run() {
               try {
                   long time = System.currentTimeMillis();
                   System.out.println("try get lock inner");
                   lock.lock(); 
                   System.out.println("get lock inner " + ( System.currentTimeMillis() - time)/1000 );
                   Thread.sleep(2000);
               } catch (Exception e) {
               } finally{
                   lock.unlock();
                   System.out.println("unlock inner ");
               }
            }
            
        }.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        try {
            long time = System.currentTimeMillis();
            System.out.println("try get lock");
            lock.lock();
            System.out.println("get lock " + ( System.currentTimeMillis() - time)/1000 );
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            lock.unlock();
        }
        
        return "sleep- ok";
    }
}
