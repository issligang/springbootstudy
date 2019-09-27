package com.issgang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  该注解用于声明该类为SpringBoot启动类
 */
@SpringBootApplication
public class SpringBootHelloWorldApplication {

    //idea书写主函数快捷键 psvm
    public static void main(String[] args) {
        /**
         *  ①创建SpringApplication对象
         *  ②调用initialize方法：
         *      Ⅰ、判断应用是否为Web应用
         *      Ⅱ、获取并保存容器初始化类
         *      Ⅲ、获取并保存监听器
         *      Ⅳ、从堆栈信息获取包含main方法的主配置类
         *  ③调用run方法：
         *      Ⅰ、获取并启动监听器
         *      Ⅱ、准备Spring上下文
         *      Ⅲ、容器的初始化、创建、加载等
         *      Ⅳ、不同的时机触发监听器的不同事件
         */
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

}
