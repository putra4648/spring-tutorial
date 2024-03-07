package com.belajar.springtutorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.life_cycle.ConnectionBean;
import com.belajar.springtutorial.life_cycle.LifeCycleBean;
import com.belajar.springtutorial.life_cycle.Server;

class LifeCycleBeanTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setup() {
        this.context = new AnnotationConfigApplicationContext(LifeCycleBean.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void destroy() {
        /// Bisa menggunakan methode `registerShutdownHook` untuk menghandle
        /// secara otomatis

        // this.context.close();
    }

    @Test
    void testLifeCycleBean() {
        ConnectionBean conn = context.getBean(ConnectionBean.class);

        Assertions.assertNotNull(conn);
    }

    @Test
    void testServerBean() {
        Server server = context.getBean(Server.class);

        Assertions.assertNotNull(server);
    }
}
