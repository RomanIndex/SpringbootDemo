package com.zz.demo.temp.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id", "ID");
        map.put("name", "name");
        map.put("mobile", "1333546");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println(map);
//        String jString = new Gson().toJson(map);
//        System.out.println(jString);
    }
}
