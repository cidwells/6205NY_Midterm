package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        try {
            Assert.assertEquals(Factorial.getIterativeFactorial(5), 120);
            System.out.println("Test passed");
        }catch (AssertionError ar){
            System.out.println("Test failed");
        }
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        try {
            Assert.assertEquals(FindMissingNumber.getMissingNumber(array), 9);
            System.out.println("Test passed");
        }catch (AssertionError ar){
            System.out.println("Test failed");
        }

    }
}
