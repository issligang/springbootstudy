package com.issgang.com.issgang.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *  lombok插件中的注释，使用该注解可以为类的属性自动添加get、set方法
 */
@Data
/**
 *  声明Bean注释，自定义组件使用该注释
 */
@Component
/**
 *  该注解用于将类中的所有属性和配置文件中的相关配置进行绑定
 */
@ConfigurationProperties(prefix = "developer")
public class DevelopmentProperty {

    private String developerName;

    private String developerWebSite;

    private String developerQQ;

    private String developerMobilePhone;

}
