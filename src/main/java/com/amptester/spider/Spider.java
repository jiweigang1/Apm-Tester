package com.amptester.spider;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Spider {
    private static OkHttpClient client = new OkHttpClient();
    public static  String Base_Path    = "http://localhost:8082/";

    public void run(){
        while(true){
            this.memoryLeak();
            this.objectInstanceTracking();
            this.customMemoryStructures();
            this.threadContention();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }

    public void memoryLeak(){
        String url = Base_Path + "memory/memoryLeak";
        _request(url);
    }

    public void objectInstanceTracking(){
        String url = Base_Path + "object/objectInstanceTracking";
        _request(url);
    }
    public void customMemoryStructures(){
        String url = Base_Path + "structures/customMemoryStructures";
        _request(url);
    }

    public void threadContention(){
        String url = Base_Path + "threadContention/sleep";
        _request(url);
    }

    private void _request(String url){
        
      
        //创建一个Request
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        try {
        	System.out.println(url + " request ");
        	System.out.println(client.newCall(request).execute().body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
