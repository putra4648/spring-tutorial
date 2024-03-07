package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import com.belajar.springtutorial.models.Bar;
import com.belajar.springtutorial.models.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LazyBean {

    /// Secara default anotasi @Lazy tidak akan membuat @Bean sebelum
    /// dipanggil untuk pertama kali
    @Lazy
    @Bean
    @DependsOn(value = "bar")
    public Foo foo() {
        log.info("Created foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("created bar");
        return new Bar();
    }
}


