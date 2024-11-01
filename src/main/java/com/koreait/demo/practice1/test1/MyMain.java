package com.koreait.demo.practice1.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring은 main에서 실행해야함
// 위에 Tomcat으로 실행하는게 아니라
public class MyMain {
    public static void main(String[] args) {

        // MyConfig.class 를 토대로 context를 가져옵니다 (관리자를 가져옴)
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // 1. context로 myMessage 가져오기
        // context는 관리자이기 때문에 관리하고 있는 Bean객체들을 가져와 사용할 수 있다
        // 이름으로 불러오면 형태를 모르기 때문에 다운캐스팅 필수 (가져왔을 때 Object로 가져옴)
        String message = (String)context.getBean("myMessage");
        System.out.println(message);
        System.out.println("===================");
        /////////////////////////////
        // 2.1 context로 james 가져오기
//        Person james = (Person) context.getBean("james");
//        System.out.println(james);

        // 2.2 Person 형태로 james 가져오기 (한 명밖에 없었던 상황)
//        // Person 형태의 객체를 가져와! (지금 james밖에 없으니 무조건 james가져옴)
//        Person james = context.getBean(Person.class); //
//        System.out.println(james);

        // 2.3 Person 형태로, 여러명 가져오기
        // 그런데 james이외에 사람이 추가되면,
        // Person.class에서 오류가 생김 (누구를 데려와야하는지 모르니까)

        // 같은 형태의 객체를 여러개 가지고 있으므로, 이름을 정확히 알려줘야 함

        Person james = context.getBean("jamesName", Person.class);
        // 이 부분에서 제임스가 태어났다! 가 출력됨
        // MyMain.java에 제임스 부분에 @Bean(name = "jamesName", initMethod = "born")가 있기 때문

        System.out.println("===================");
        james.setAge(4544);
        System.out.println("james=========> "+james);

        Person tom = context.getBean("tom", Person.class);
        System.out.println("tom=========> "+tom);

        james = context.getBean("jamesName", Person.class);
        System.out.println("jamesName=========> "+james);

        /****************************************************/
        ApplicationContext otherContext = new AnnotationConfigApplicationContext(OtherConfig.class);
        System.out.println(otherContext.getBean("myMessage"));


    }
}
