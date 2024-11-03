package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // http://localhost:8080/
    // Mapping 된 것이 없으면 resource > static 폴더의 html 파일로 접근함
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
