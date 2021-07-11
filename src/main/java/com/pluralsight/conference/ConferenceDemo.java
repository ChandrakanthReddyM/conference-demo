package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootConfiguration
@SpringBootApplication
public class ConferenceDemo extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConferenceDemo.class,args);
    }
}
