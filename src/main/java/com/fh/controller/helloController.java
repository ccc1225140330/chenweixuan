package com.fh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class helloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "say---- hello";
    }

    private String ss(){
        return "sdf";
    }

    private String ss1(){
        return "dfggd";
    }
    XCVXFGCGH
}
