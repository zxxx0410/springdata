package com.qfedu.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication//注解表示是SpringBoot的开关类 就是启动项目的入口
//@ComponentScan("com.qfedu.boot1805") //注意如果需要扫描的类和开关类相差不超过1个包就可以省略，否则必须写出
public class SpringdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);

    }
}
