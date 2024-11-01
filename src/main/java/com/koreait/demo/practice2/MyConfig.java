package com.koreait.demo.practice2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {
        "com.koreait.demo.practice1",
        "com.koreait.demo.practice2",
})
@Configuration // @Configuration과, MyMain.java의 ApplicationContext은 연결된 개념
public class MyConfig {
}
