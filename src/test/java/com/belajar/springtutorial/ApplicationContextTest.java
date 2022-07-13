package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContextTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        // Check nilai context apakah null / tidak
        Assertions.assertNotNull(context);
    }
}
