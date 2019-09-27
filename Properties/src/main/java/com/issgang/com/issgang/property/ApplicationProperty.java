package com.issgang.com.issgang.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationProperty {

    /**
     *  读取application.properties配置文件中的属性值
     */
    @Value("${application.applicationName}")
    private String applicationName;

    @Value("${application.applicationVersion}")
    private String applicationVersion;

}
