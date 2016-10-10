

package com.pronetbeans.examples;


import junit.framework.*;


public class CalcTest extends TestCase {


    public CalcTest(String testName) {
        super(testName);
    }


    /**
    * Test of checkNum method, of class com.pronetbeans.examples.Calc.
    */
    public void testCheckNum() {

        System.out.println("checkNum");
        int origVal = 0;

        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.checkNum(origVal);

        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    public void testCheckNumFail() {

        int origVal = 20;
        Calc instance = new Calc();
        int expResult = 18;
        int result = instance.checkNum(origVal);

        if(expResult == result) {
            fail("The expected result should NOT match the actual result.");
        }
    }

}

