package com.koreait.demo.practice3.test1;

import lombok.ToString;
import org.springframework.stereotype.Component;


@ToString
@Component // Spring이 관리할 객체(빈)이라는 것을 표시
public class Animal {
    private String name;
}
