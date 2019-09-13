package com.github.hekonsek.aws.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AwsSpringCloudConfigServer {

    public static void main(String... arguments) {
        SpringApplication.run(AwsSpringCloudConfigServer.class, arguments);
    }

}