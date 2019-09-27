package com.issgang.controller;

import cn.hutool.core.lang.Dict;
import com.issgang.com.issgang.property.ApplicationProperty;
import com.issgang.com.issgang.property.DevelopmentProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    private final DevelopmentProperty developmentProperty;
    private final ApplicationProperty applicationProperty;

    @Autowired
    public PropertiesController(DevelopmentProperty developmentProperty, ApplicationProperty applicationProperty){
        this.developmentProperty = developmentProperty;
        this.applicationProperty = applicationProperty;
    }

    /**
     *  Dict是Hutool中的工具类
     */
    @GetMapping("/property")
    public Dict index(){
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developmentProperty);
    }

}
