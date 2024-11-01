package com.koreait.demo.practice3;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    int add(int n1, int n2){
        System.out.println("add가 실행되었습니다");
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        return n1 + n2;
    }
}
