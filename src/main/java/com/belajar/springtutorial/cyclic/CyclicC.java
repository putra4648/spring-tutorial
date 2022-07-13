package com.belajar.springtutorial.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicC {
    private CyclicA cyclicA;
}
