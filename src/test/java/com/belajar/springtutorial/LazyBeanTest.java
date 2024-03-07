package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.bean.LazyBean;
import com.belajar.springtutorial.models.Foo;

class LazyBeanTest {
    private ApplicationContext context;

    @BeforeEach
    void setup() {
        this.context = new AnnotationConfigApplicationContext(LazyBean.class);
    }

    @Test
    void testLazyBean() {
        Assertions.assertNotNull(context.getBean(Foo.class));
    }
}
