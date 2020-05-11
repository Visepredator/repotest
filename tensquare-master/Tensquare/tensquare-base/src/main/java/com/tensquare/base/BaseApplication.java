package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-21 21:20
 * @Author: 846602483
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class BaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(BaseApplication.class,args);


    }

    @Bean
    public IdWorker idWorker(){

        return new IdWorker();


    }


}
