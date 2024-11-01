package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@Controller // 컨트롤러로 사용할 파일에 표시
public class HelloController {

    // http://localhost:8080/hello로 접근하면 실행됨
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "반가워요~!!");
        return "hello"; // hello.html으로 가서 렌더링하라는 의미 (thymeleaf 템플릿 엔진 처리)
    }

    // http://localhost:8080/hello-mvc?name="홍길동"
    @GetMapping("hello-mvc")
    // required=false 하면, name을 입력하지 않아도 정상 작동됨
    public String helloMvc(@RequestParam(value="name", required=false) String nameStr, Model model) {
        model.addAttribute("name", nameStr);
        return "hello-template"; // hello-template.html
    }

    @GetMapping("hello-string")
    @ResponseBody // html의 body가 아닌, http의 body부에 해당 내용을 직접 넣겠다
    // 해당 페이지에서 소스보기를 했을 때
    // string을 보내면, string만 딱 나옴 (원래는 html 다 나왔지)
    public String helloString(@RequestParam(name) String nameStr) {
        return "텍스트만 바로 출력할 수 있다!"; // html이 아닌 텍스트가 화면에 바로 출력됨
        // ex. "hello 홍길동"
    }

    @GetMapping("hello-api")
    @ResponseBody
    // 클래스를 이용
    public HelloClass helloApi(@RequestParam("name") String nameStr1) {
        HelloClass hello = new HelloClass(); // 객체생성
        hello.setName(nameStr1);
        return hello; // json 방식으로 출력됨
        // ex. {"name":"이름을입력해보자"}
    }

    static class HelloClass {
        private String name;

        public String getName() {
            return name;
        }
        public String setName(String nameStr2) {
            return name = nameStr2;
        }
        
    }


}
