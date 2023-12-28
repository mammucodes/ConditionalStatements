package com.w3.mammutest;

import com.w3.mammu.PositiveNegative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveNegativeTest {
    @Test
    public void isPositiveTest(){
        int num = 4;
        PositiveNegative ps = new PositiveNegative();
        boolean result =  ps.isPositive(num);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void isPositiveTestNegativeCase(){
        int num = -4;
        PositiveNegative ps = new PositiveNegative();
        boolean result =  ps.isPositive(num);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void isPositiveTestZero(){
        int num = 0;
        PositiveNegative ps = new PositiveNegative();
        boolean result =  ps.isPositive(num);
        Assertions.assertEquals(true, result);
    }
}
