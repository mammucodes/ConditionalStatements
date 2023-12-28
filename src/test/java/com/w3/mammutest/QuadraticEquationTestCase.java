package com.w3.mammutest;

import com.w3.mammu.QuadrticEquation;
import com.w3.mammu.RootsOfQuadrticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTestCase {
    @Test
    public  void QuadraticEquationPositiveTest(){
        int a = 1,b=5,c=1;
        QuadrticEquation qr = new QuadrticEquation();
        RootsOfQuadrticEquation result = qr.hasQuadraticRoots(a,b,c);
        if(result == null) {
            Assertions.fail("hasQuadraticRoots m should not return null!");
        }
        Assertions.assertEquals(-0.20871215252208009,result.getRoot1());
        Assertions.assertEquals(-4.7912878474779195,result.getRoot2());
    }

    @Test
    public  void QuadraticEquationAZeroTest(){
    int a =0,b=1,c=1;
    QuadrticEquation qr = new QuadrticEquation();

//    Assertions.assertThrows(ArithmeticException.class,
//            () -> qr.hasQuadraticRoots(a,b,c));

        //OR

       RootsOfQuadrticEquation ans =  qr.hasQuadraticRoots(a,b,c);

Assertions.assertEquals(Double.NaN,ans.getRoot1());
Assertions.assertEquals(Double.NEGATIVE_INFINITY, ans.getRoot2());// if  -neg/0 result:Neg.infintiy
        //if postivenum/0 result Pstive_infinty
    }


}
