package com.koreait.demo.practice2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component // Spring이 관리할 객체(빈)이라는 것을 표시
public class School {
    @Autowired
    private Person person;
}





