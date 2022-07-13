package com.belajar.springtutorial.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belajar.springtutorial.models.cyclic.CyclicA;
import com.belajar.springtutorial.models.cyclic.CyclicB;
import com.belajar.springtutorial.models.cyclic.CyclicC;

@Configuration
public class CircularDependencies {

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
