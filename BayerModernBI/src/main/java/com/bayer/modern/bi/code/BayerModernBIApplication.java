package com.bayer.modern.bi.code;

import com.bayer.modern.bi.code.controller.DepartmentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BayerModernBIApplication {

    public static void main(String[] args) {
        SpringApplication.run(BayerModernBIApplication.class, args);
    }
}