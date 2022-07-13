package com.belajar.springtutorial.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belajar.springtutorial.cyclic.CyclicA;
import com.belajar.springtutorial.cyclic.CyclicB;
import com.belajar.springtutorial.cyclic.CyclicC;

@Configuration
public class CyclicDI {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
