package com.example.springdemo.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSort {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("A1","1111111");
        map.put("A2","2222222");
        map.put("A3","3333333");
        map.put("A4","4444444");

        //方法1
/*        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Map.Entry key" + entry.getKey());
            System.out.println("Map.Entry value" + entry.getValue());
        }*/

        map.entrySet();
        map.keySet();
        map.values();

        //Map<String, Object> map2 = new HashMap<>(1 << 4);
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("key:" + entry.getKey() + "value:" + entry.getValue());
        }
    }
}
