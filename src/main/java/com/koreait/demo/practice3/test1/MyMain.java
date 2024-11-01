package com.koreait.demo.practice3.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Animal animal = context.getBean(Animal.class);
        Zoo zoo = context.getBean(Zoo.class);
//        zoo.setAnimal(null);
        System.out.println(zoo);
    }
}









