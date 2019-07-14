package com.jasmine;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 如果mybatis中service实现类中加入事务注解，需要此处添加该注解
public class MybootApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MybootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
