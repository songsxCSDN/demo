package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin")
public class HelloController {
    //页面控制
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @PostMapping(value = "/loginUrl")
    @ResponseBody
    public Map loginUrl(String name , String password){
        Map map = new HashMap();
        map.put("code","200");
        map.put("msg","登录成功");
        return map;
    }
}
