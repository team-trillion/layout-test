package team.trillion.yamuzip.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/")
    public String defaultRequest() {
        return "main";
    }

    @GetMapping("/example")
    public String ex() {
        return "example";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

