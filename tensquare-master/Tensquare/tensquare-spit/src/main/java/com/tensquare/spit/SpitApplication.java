package com.tensquare.spit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @program: tensquare-parent
 * @Date: 2019-3-24 21:21
 * @Author: 846602483
 * @Description:
 */
@SpringBootApplication
public class SpitApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpitApplication.class);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();

    }
}
