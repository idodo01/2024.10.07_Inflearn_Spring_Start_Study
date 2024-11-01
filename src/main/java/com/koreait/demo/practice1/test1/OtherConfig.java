package com.koreait.demo.practice1.test1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {
    @Bean // Spring이 관리하는 Bean객체가 된다
    String myMessage(){
        return new String("Hello World^-^");
    }
}
