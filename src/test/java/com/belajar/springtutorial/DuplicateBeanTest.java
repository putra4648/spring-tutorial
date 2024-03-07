package com.belajar.springtutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.belajar.springtutorial.bean.DuplicateBean;
import com.belajar.springtutorial.models.Foo;

class DuplicateBeanTest {

    @Test
    void testDuplicate() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DuplicateBean.class);

        // Jika ada Bean sama akan melempar error berupa
        // Bean tidak unique / harus berbeda
        // tidak bisa membuat 2 bean dengan tipe data yang sama
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            context.getBean(Foo.class);
        });

        context.close();
    }

    @Test
    void testGetDuplicateBean() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DuplicateBean.class);

        // Agar tidak terjadi error jika tipe data bean sama
        // harus menggunakan nama Bean yang berbeda
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);

        context.close();
    }
}
