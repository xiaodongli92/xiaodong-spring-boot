package com.xiaodong.boot.child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiaodong on 16/7/27.
 */
@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello spring boot child";
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
