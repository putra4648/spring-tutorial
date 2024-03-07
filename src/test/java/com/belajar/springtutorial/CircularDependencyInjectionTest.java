package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.di.CircularDependencies;

class CircularDependencyInjectionTest {
    @Test
    void testCircularDI() {
        Assertions.assertThrows(Throwable.class, () -> {
            new AnnotationConfigApplicationContext(CircularDependencies.class).close();;
        });
    }
}
