package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨르롤러 선언 해주어야함
public class HelloController {
    @GetMapping("hello") //웹 어플리케이션에서 /hello 맵핑 찾기
    public String hello(Model model) {
        model.addAttribute("data", "Hello!!");
        return "hello";// ViewREsolver가 resources/templates의 hello.html 찾아서 처리
    }
}