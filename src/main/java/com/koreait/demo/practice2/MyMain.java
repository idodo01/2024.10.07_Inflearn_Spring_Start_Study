package com.koreait.demo.practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // 1. Person
        Person person = context.getBean(Person.class);
        person.setName("김나나");

        // 2. School
        School school = context.getBean(School.class); // School 클래스내에 Person 객체 변수 있음
        System.out.println("school=======>"+school);

        /**************************************************************************/
//        try {
//            // 싱글턴 패턴으로 무조건 사람은 하나만 만들어짐!
//            Person person = context.getBean(Person.class);
//            person.setName("홍길동");
//            System.out.println(person);
//
//            Person person1 =context.getBean(Person.class);
//            System.out.println(person1);
//
//        }catch (Exception e){
//            System.out.println("person을 못찾음");
//        }
//
//        try {
//            Cat cat = context.getBean(Cat.class);
//            System.out.println(cat);
//        }catch (Exception e){
//            System.out.println("cat을 못찾음");
//        }
        /*******************************************************/
//        System.out.println(MyObject.instance);

        // 3. myObject
        MyObject myObject = MyObject.getInstance();
        System.out.println(myObject);

        MyObject myObject1 = MyObject.getInstance();
        System.out.println(myObject1);

//        MyObject myObject1 = MyObject.instance
//        MyObject myObject2 = new MyObject();
//        MyObject myObject3 = new MyObject();
//        System.out.println(myObject1);
//        System.out.println(myObject1.instance);
//
//        System.out.println(myObject2);
//        System.out.println(myObject2.instance);
//
//        System.out.println(myObject3);
//        System.out.println(myObject3.instance);



        /***********************************************/




    }
}
