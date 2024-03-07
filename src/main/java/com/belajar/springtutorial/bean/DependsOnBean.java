package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import com.belajar.springtutorial.models.Bar;
import com.belajar.springtutorial.models.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnBean {

    /// Jika menggunakan anotasi @DependsOn maka Bean ini akan dibuat
    /// setelah @Bean 'bar' terbuat dahulu
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
