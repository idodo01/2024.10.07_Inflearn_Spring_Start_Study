package com.koreait.demo.practice1.test1;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;

import org.springframework.context.annotation.*;

@Configuration
public class MyConfig {
    // 기본적으로 메서드명 == Bean 이름 (myMessage)
    @Bean // Spring이 관리하는 Bean객체가 된다
    String myMessage() {
        return new String("my message");
    }

    // 3. Bean 객체를 getBean을 했을 때 생성 (그 전에는 생성해두지 않음)
    @Lazy
    // 1. Bean의 이름을 메서드명이 아니라, 지정하고 싶을 경우
    @Bean(name = "jamesName", initMethod = "born")
    Person james(){
        Person p = new Person("제임스", 50);
        // 2. p.born(); 를 하면 나중에 필요없어졌을 때,
        // 하나하나 지워줘야한다 -> 번거롭다
        // 그렇기에 initMethod로 바로 넘겨주는 방법 사용
        return p;
    }

    @Bean
    Person tom(){
        Person p = new Person("탐앤탐스", 10);
        return p;
    }
}
