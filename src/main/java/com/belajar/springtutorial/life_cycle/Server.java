package com.belajar.springtutorial.life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    void start() {
        log.info("Start server");
    }


    @PreDestroy
    void stop() {
        log.info("Stop server");
    }
}
