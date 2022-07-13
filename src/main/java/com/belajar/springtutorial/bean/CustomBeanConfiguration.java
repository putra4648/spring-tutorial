package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.belajar.springtutorial.Foo;

@Configuration
public class CustomBeanConfiguration {
    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}
