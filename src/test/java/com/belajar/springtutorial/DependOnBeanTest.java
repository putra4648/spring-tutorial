package com.belajar.springtutorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.bean.DependsOnBean;

class DependOnBeanTest {
    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setup() {
        this.context = new AnnotationConfigApplicationContext(DependsOnBean.class);
    }

    @Test
    void testDependsOn() {

        context.close();
    }
}
