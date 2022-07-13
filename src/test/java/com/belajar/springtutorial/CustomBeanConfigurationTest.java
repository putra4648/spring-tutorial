package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.belajar.springtutorial.bean.CustomBeanConfiguration;

public class CustomBeanConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        context = new AnnotationConfigApplicationContext(CustomBeanConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo = context.getBean(Foo.class);
        Foo fooFirst = context.getBean("fooFirst", Foo.class);
        Foo fooSecond = context.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, fooFirst);
        Assertions.assertNotSame(foo, fooSecond);

    }
}
