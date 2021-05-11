package lv.ctco.task1;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void isInteger_PositiveTest() {
        System.out.println();
        String a = "12";
        boolean integerTrue = NumberUtils.isInteger(a);
        System.out.println();
        System.out.println("Verified value is " + a);
        Assert.assertTrue(integerTrue);
        System.out.println("method isInteger works correctly, observed value - " + integerTrue);
    }

    @Test
    public void isInteger_NegativeTest() {
        String s = "2a2";
        boolean integerFalse = NumberUtils.isInteger(s);
        System.out.println();
        System.out.println("Verified value is " + s);
        Assert.assertFalse(integerFalse);
        System.out.println("method isInteger works correctly, observed value - " + integerFalse);
    }
}