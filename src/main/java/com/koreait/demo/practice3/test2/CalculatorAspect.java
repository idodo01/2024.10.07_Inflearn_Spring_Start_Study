package com.koreait.demo.practice3.test2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorAspect {
    @Before("execution(* com.koreait.demo.Calculator.add(int, int))")
    void log_before(){
        System.out.println("add가 실행되기 전 - log_before");
    }
}








