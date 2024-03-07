package com.belajar.springtutorial.life_cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleBean {

    @Bean
    public ConnectionBean connection() {
        return new ConnectionBean();
    }

    // Jika menggunakan versi Bean dengan method tambahan disini
    // @Bean(initMethod = "start", destroyMethod = "stop")

    // Jika menggunakan Bean dengan anotasi tambahan @PostConstruct dan @PreDestroy
    @Bean
    public Server myServer() {
        return new Server();
    }
}
