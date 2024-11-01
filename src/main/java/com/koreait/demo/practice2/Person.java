package com.koreait.demo.practice2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component // Spring이 관리할 객체(빈)이라는 것을 표시
// 빈으로 등록하면, 언제든지 필요할 때 사용 가능!
public class Person {
    private String name;
}






