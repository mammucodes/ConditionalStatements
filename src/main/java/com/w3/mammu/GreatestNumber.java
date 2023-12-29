package com.w3.mammu;

public class GreatestNumber {
    public   int greatestNumber(int a, int b, int c) {
        if(a>b && a>c )
            return a;
        else if(b>c && b>a)
            return b;
        else
            return c;

    }
}
