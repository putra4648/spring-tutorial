package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.bean.DatabaseBean;
import com.belajar.springtutorial.models.Foo;

class DatabaseBeanTest {

    @Test
    void testCreatedBean() {
        // Context walaupun belum dipanggil tetap akan membuat di dalam IoC
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        Assertions.assertNotNull(applicationContext);
    }

    @Test
    void testGetBean() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DatabaseBean.class);

        // Bean adalah singleton secara default
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);

        context.close();
    }
}
