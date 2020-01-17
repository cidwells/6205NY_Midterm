package string.problems;

import math.problems.Factorial;
import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        try {
            Assert.assertEquals(Palindrome.isPalindrome("kayak"),true);
            System.out.println("Test passed");
        }catch (AssertionError ar){
            System.out.println("Test failed");
        }
    }
}
