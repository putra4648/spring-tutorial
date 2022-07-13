package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belajar.springtutorial.Foo;

@Configuration
public class DuplicateBean {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
