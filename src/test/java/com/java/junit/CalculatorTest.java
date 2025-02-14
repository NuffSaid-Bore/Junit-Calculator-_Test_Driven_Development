package com.java.junit;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{

    @Test
    public void addTwoPositiveNumbersTest(){

        // Arrange
        int a = 1;
        int b = 2;

        // Act
        int one_plus_two = Calculator.add(a , b);

        // Assert
        assertEquals(3, one_plus_two);
    }

        @Test
    public void addTwoNegativeNumbersTest(){

         // Arrange
        int f = -1;

        // Act
        int negative_one_plus_negative_one = Calculator.add(f , f);

        // Assert
        assertEquals(-2, negative_one_plus_negative_one);
    }

    @Test 
    public void addMultipleNumbersTest(){

        // Arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // Act
        int one_to_five_add = Calculator.add(a , b , c , d , e);

        // Assert
        // using the modified method
        assertEquals(15, one_to_five_add);
    }

    @Test
    public void multiplyTwoPositiveNumbersTest(){

        // Arrange
        int a = 1;
        int c = 3;
        

        // Act
        int multiply_one_by_three = Calculator.multiply(a , c);

        // Assert
        assertEquals(3, multiply_one_by_three);
    }

    @Test
    public void multiplyNegativeByThreeTest(){

        // Arrange
        int f = -1;
        int c = 3;

        // Act
        int multiply_neg_one_three = Calculator.multiply(f , c);
        
        // Assert
        assertEquals(-3, multiply_neg_one_three);
    }

    
    @Test
    public void multiplyMultipleNumbersTest(){
        // Arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        // Act
        int multiply_one_to_five = Calculator.multiply(a, b, c, d, e);

        // Assert
        // using the modified method
        assertEquals(120, multiply_one_to_five);
    }


}
