package top.fivice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wubin
 * @version 1.0.0
 * @description TDOO
 * @ClassName Application
 * @date 2019/1/1 22:15
 **/
@SpringBootApplication
//@MapperScan()
public class Application{

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
