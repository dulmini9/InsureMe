package com.example.insureme;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testVehicleCalculationsValidation(){
        assertEquals(0.0,Calculator.calculatorVehicle("","",true,true,1000.00,"","","","",""),0);
    }

    @Test
    public void testVehicleCalculations(){
        assertEquals(19800.0,Calculator.calculatorVehicle("car","full",true,false,4500000.00,"private","petrol","Toyota","Vitz","2009"),0);
    }

    @Test
    public void testTwoWheelerCalculationsValidation(){
        assertEquals(0.0,Calculator.calculatorTwoWheelers("",true,false,100000.00,"petrol","","",""),0);
    }

    @Test
    public void testTwoWheelerCalculations(){
        assertEquals(2000.0,Calculator.calculatorTwoWheelers("full",true,false,100000.00,"petrol","Yamaha","FZ","2018"),0);
    }

}