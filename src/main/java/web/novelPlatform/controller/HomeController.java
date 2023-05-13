package web.novelPlatform.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        log.info("@@@ 로그 출력 @@@");
        return "home";
    }
}