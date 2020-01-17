package math.problems;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Factorial myFactorial = new Factorial();
        System.out.println(myFactorial.getIterativeFactorial(5));
        System.out.println(myFactorial.factorialRecursive(5));
    }

    public int getIterativeFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public int factorialRecursive(int num)
    {
        if (num == 0)
            return 1;

        return num*factorialRecursive(num-1);
    }
}