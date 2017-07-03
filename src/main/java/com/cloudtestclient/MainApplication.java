package com.cloudtestclient;

import com.cloudtestclient.controllers.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

/**
 * Created by admin on 2017/7/3.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) throws RestClientException, IOException {
        ApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
        ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
        System.out.println(consumerControllerClient);
        consumerControllerClient.getEmployee();
    }

    @Bean
    public ConsumerControllerClient consumerControllerClient()
    {
        return new ConsumerControllerClient();
    }
}
