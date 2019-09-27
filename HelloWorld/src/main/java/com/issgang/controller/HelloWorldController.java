package com.issgang.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  该注解用于生命该类为Controller
 *      使用该注解，相当于是使用@Controller + @ResponseBody
 *      使用@RestController注解，则无法返回jsp页面或者html页面，配置的视图解析器将会失效，通常用于向前端返回json数据
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, name = "who") String who){
        if(StringUtils.isEmpty(who)){
            who = "World";
            return "Hello " + who + "!";
        } else {
            return who + ",Hello World!";
        }
    }

}
