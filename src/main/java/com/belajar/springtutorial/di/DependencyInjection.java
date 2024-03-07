package com.belajar.springtutorial.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.belajar.springtutorial.models.Bar;
import com.belajar.springtutorial.models.Foo;
import com.belajar.springtutorial.models.FooBar;

@Configuration
public class DependencyInjection {

    // Secara default nilai Foo akan di isi disini
    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    // Bean Foo versi optional
    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    // Secara default nilai Foo akan di isi dengan Primary Bean
    // Fungsi @Qualifier adalah memilih DI yang akan digunakan
    // Dalam kasus ini menggunakan nama Bean "fooSecond" untuk mengisi parameter Foo
    @Bean
    public FooBar fooBar(@Qualifier(value = "fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
