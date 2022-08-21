package bbyuk.excel.domain.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class WebTestController {

    @GetMapping
    public String getTestPage() {
        return "test";
    }

}
