package com.belajar.springtutorial.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belajar.springtutorial.Bar;
import com.belajar.springtutorial.Foo;

@Configuration
public class DIConfig {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
