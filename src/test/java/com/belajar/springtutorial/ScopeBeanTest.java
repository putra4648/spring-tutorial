package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.bean.ScopeBean;
import com.belajar.springtutorial.models.Foo;

class ScopeBeanTest {

    private ApplicationContext context;

    @BeforeEach
    void setup() {
        this.context = new AnnotationConfigApplicationContext(ScopeBean.class);
    }

    @Test
    void scopeBeanTest() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);
    }

}
