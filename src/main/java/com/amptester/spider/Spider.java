package com.amptester.spider;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Spider {
    public static String Base_Path = "http://localhost:8082/";

    public void run(){
        while(true){
            this.memoryLeak();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }

    public void memoryLeak(){
        String url = Base_Path + "memory/memoryLeak";
        OkHttpClient client = new OkHttpClient();
        //创建一个Request
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        try {
           System.out.println(client.newCall(request).execute().body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
