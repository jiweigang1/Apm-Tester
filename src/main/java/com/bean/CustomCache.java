package com.bean;

import java.util.Arrays;

public class CustomCache {
    int index = 0;
    private Object[] datas = new Object[100];

    public void add(Object object){
        if(index == datas.length ){
            datas  = Arrays.copyOf(datas, datas.length + 100);
        }
        datas[index] = object;
        index++;
    }
}
