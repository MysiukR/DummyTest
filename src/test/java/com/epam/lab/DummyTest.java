package com.epam.lab;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyTest {
    private static final double FIRST_NUMBER = 5.5;
    private static final double SECOND_NUMBER = 4.5;
    private static final double EXPECTED_RESULT = 10.0;

    @Test
    private void addingTwoNumbers() {
        double sum = FIRST_NUMBER + SECOND_NUMBER;
        Assert.assertEquals(sum,EXPECTED_RESULT);
        System.out.println(String.format("Result: %f",sum));
    }
}
