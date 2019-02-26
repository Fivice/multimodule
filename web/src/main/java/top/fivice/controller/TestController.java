package top.fivice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fivice.test.ITestService;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName TestController
 * @date 2019/1/1 22:19
 **/
@RestController
@RequestMapping("/demo")
public class TestController {
    @Autowired
    private ITestService iTestService;
    @RequestMapping("/test")
    public String test(){
        return iTestService.test();
    }
}
