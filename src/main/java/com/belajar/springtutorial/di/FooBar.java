package com.belajar.springtutorial.di;

import com.belajar.springtutorial.Bar;
import com.belajar.springtutorial.Foo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {
    private Foo foo;
    private Bar bar;
}
