package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belajar.springtutorial.models.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DatabaseBean {
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Created");
        return foo;
    }
}
