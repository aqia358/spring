package com.youdao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuhongliang on 2015/2/6.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value="/test")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index.jsp";
    }
}
