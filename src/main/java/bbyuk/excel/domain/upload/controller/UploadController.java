package bbyuk.excel.domain.upload.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RequestMapping("/upload")
@RestController
public class UploadController {

    @PostMapping
    public void upload(HttpServletRequest request) {
        log.debug(request.toString());
    }
}
