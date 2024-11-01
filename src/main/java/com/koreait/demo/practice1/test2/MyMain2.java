package com.koreait.demo.practice1.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// test1.Mymain: MyConfig에서, bean를 지정해서 사용하는 방법
// test2.Mymain2: resources > application-context에서, bean를 지정해서 사용하는 방법
public class MyMain2 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Animal noConstAnimal = context.getBean(Animal.class);
        System.out.println(noConstAnimal);
    }
}
