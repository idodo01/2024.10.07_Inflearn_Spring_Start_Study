package com.koreait.demo.practice1.test1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    void born(){
        System.out.println(name + "가 태어났다!");
    }

}
