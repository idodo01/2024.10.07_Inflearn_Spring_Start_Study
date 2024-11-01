package com.koreait.demo.practice3.test1;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Component
//@NoArgsConstructor // => 기본 생성자 생성하기. 주입 안됨
//@AllArgsConstructor // => 모든 변수의 생성자 생성하기. 전부 주입됨
//@RequiredArgsConstructor // => final이 붙은 필드만 모아서 생성자를 만들어줌
public class Zoo{
    // 1) 필드 주입 (Autowiring)
//    @Autowired(required = false)
    private Animal animal;
//    private final ArrayList<Date> dates; // final이 붙은 변수는 @RequiredArgsConstructor 영향 받음

    // 2) 생성자 주입 (Autowiring)
//    public Zoo(Animal animal) {
//        this.animal = animal;
//    }

    // 3) Setter 주입 (Autowiring)
    // Setter가 정의되어 있으면 자동으로 setter 메서드를 실행해서 Bean객체를 주입한다
    // (우리가 직접 setter를 실행하지 않아도)
//    @Autowired
//    public void setAnimal(Animal animal) {
//        System.out.println("setter 실행되었음");
//        this.animal = animal;
//    }

    // 3) 일반 메서드 주입 (Autowiring)
    // 일반 메서드라고 보세요.
    // setAnimal을 실행할 때, animal 변수에 null을 전달하면,
    // Config가 가지고 있는 Animal의 Bean 중 하나를 찾아서 자동으로 넣는다
    @Autowired
    void test_method(Animal animal){
//        System.out.println("test: " + test);
        this.animal = animal;
    }
}
