package com.pronetbeans.examples;

public class BadCode {


    public int calculate(int x, int y, int z)
    {
        int total = 0;
        if(x<y) {
            total = x + y;
        } else if(x > y)
        {
            total = x + z;
        } else {
            total = x+ y + z;
        }
        return total;
    }



}