package bbyuk.excel.domain.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/web")
public class WebTestController {

    @GetMapping
    public String getTestPage() {
        log.debug("Web test page loading OK");
        return "test";
    }

}
