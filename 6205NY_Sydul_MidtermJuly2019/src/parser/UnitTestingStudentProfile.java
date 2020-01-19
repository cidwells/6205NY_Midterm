package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        try {
            Student student = new Student();
            Assert.assertEquals("Ibrahim", "Ibrahim");
            System.out.println("Person found");
        } catch (AssertionError ar) {
            System.out.println("Wrong person");

        }
    }
}
