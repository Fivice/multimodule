package top.fivice.test.impl;

import org.springframework.stereotype.Service;
import top.fivice.test.ITestService;

@Service
public class iTestServiceImpl implements ITestService {
    @Override
    public String test() {
        return "测试";
    }
}
