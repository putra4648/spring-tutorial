package com.belajar.springtutorial.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.belajar.springtutorial.models.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeBean {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("created food");
        return new Foo();
    }
}
