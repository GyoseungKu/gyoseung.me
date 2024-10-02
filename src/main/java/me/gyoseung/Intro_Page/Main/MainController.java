package me.gyoseung.Intro_Page.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = {"main"}) //인트로 페이지
    public String main() {
        return "index";
    }

    @GetMapping(value = {"info"}) //자기소개 페이지
    public String info() {
        return "info";
    }
}
