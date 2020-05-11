package com.tensquare.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: tensquare-parent
 * @Date: 2019-4-2 18:00
 * @Author: 846602483
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer.class);

    }


}
