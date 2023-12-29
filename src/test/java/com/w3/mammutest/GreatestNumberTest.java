package com.w3.mammutest;

import com.w3.mammu.GreatestNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestNumberTest {
    @Test
    public void GreatestNumberTest(){
        int a = 45, b = 30, c = 20;
        GreatestNumber gn = new GreatestNumber();
        int result =  gn.greatestNumber(a,b,c);
        Assertions.assertEquals(45,result);
    }
}
