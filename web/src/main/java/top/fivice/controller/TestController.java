package top.fivice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName TestController
 * @date 2019/1/1 22:19
 **/
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "webapp start...";
    }
}
