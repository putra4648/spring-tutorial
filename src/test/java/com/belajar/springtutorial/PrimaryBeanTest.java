package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.belajar.springtutorial.bean.PrimaryBean;

public class PrimaryBeanTest {

    @Test
    void testPrimaryBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBean.class);

        // foo adalah primary bean
        Foo foo = context.getBean(Foo.class);

        // foo1 sebenarnya adalah primary bean walaupun sudah diberi nama sehingga
        // jika dipanggil akan mengembalikan object bean yang sama
        // yaitu foo
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        // Sama, karena foo = foo1
        Assertions.assertSame(foo, foo1);

        // Berbeda, karena foo = foo1 dan foo2 juga berbeda karena nama bean juga
        // berbeda
        Assertions.assertNotSame(foo, foo2);

        // Berbeda, karena sudah ada nama bean yang berbeda
        Assertions.assertNotSame(foo1, foo2);
    }
}
