package com.belajar.springtutorial.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicB {
    private CyclicC cyclicC;
}
