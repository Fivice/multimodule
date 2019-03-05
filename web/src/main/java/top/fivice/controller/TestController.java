package top.fivice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.fivice.test.ITestService;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName TestController
 * @date 2019/1/1 22:19
 **/
@Controller
@RequestMapping("/demo")
public class TestController {
    @Autowired
    private ITestService iTestService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return iTestService.test();
    }
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "thymeleaf");
        return "hello";
    }
}
