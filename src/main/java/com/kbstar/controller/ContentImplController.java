package com.kbstar.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ContentImplController {
    @RequestMapping("/c1")
    public Object c1(){
        //[[],[]]
        JSONObject jo = new JSONObject();
        JSONArray jaCnt = new JSONArray();

        for(int i = 1; i<=12; i++){
            Random r = new Random();
            int cnt = r.nextInt(10000)+1;
            jaCnt.add(cnt);
        }
        JSONArray jaYear = new JSONArray();
        for(int i=2011; i<=2023; i++){
            jaYear.add(i);
        }
        jo.put("category", jaYear);
        jo.put("datas", jaCnt);
        return jo;
    }


    @RequestMapping("/c2")
    public Object c2(){
        //[[],[]]
        JSONArray jarray = new JSONArray();

        for(int j=1; j<=2; j++){
            JSONArray ja = new JSONArray();
            for(int i=1; i<=10; i++){
                Random r = new Random();
                int num1 = r.nextInt(100)+1;
                int num2 = r.nextInt(100)+1;
                int num3 = r.nextInt(100)+1;
                JSONArray jadata = new JSONArray();
                jadata.add(num1);
                jadata.add(num2);
                jadata.add(num3);
                ja.add(jadata);
            }
            jarray.add(ja);
        }
        return jarray;
    }

    @RequestMapping("/c3")
    public Object c3() {
        //[[],[]]
        JSONArray jarray = new JSONArray();

        for (int i = 1; i <= 10; i++) {
            Random r = new Random();
            int x = r.nextInt(100) + 1;
            int y = r.nextInt(100) + 1;
            int z = r.nextInt(100) + 1;
            JSONObject jobject = new JSONObject();
            jobject.put("x", x);
            jobject.put("y", y);
            jobject.put("z", z);
            jobject.put("name", "data"+i);
            jobject.put("country", "country"+i);
            jarray.add(jobject);
        }
        return jarray;

    }
}
