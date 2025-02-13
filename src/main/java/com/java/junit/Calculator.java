package com.java.junit;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main( String[] args )
    {
      
    }

     public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    // Modified Add Method( Using variable Arguments)
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

     public static int multiply(int a, int b) {
        return a*b;
    }

     // Modified multiply to handle multiple numbers
     public static int multiply(int... numbers) {
        int results = 1;
        for (int number : numbers) {
            results *= number;
        }
        return results;
    }


}
