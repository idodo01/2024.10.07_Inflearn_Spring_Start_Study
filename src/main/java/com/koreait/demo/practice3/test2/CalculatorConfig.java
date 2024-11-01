package com.koreait.demo.practice3.test2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
// 이 Config는 AOP를 사용한다
@EnableAspectJAutoProxy
public class CalculatorConfig {
}
