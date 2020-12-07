package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/admin")
public class DownController {

    @GetMapping(value = "/down")
    @ResponseBody
    public Map down(String uId){
        Map map = new HashMap();
        if(uId != null && uId!=""){
            map.put("code","200");
            map.put("msg","下载成功");
        }else{
            map.put("code","500");
            map.put("msg","下载失败");
        }
        return map;
    }
}
