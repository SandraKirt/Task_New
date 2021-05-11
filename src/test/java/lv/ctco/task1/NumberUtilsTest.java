package lv.ctco.task1;

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilsTest {
    @Test
    public void isInteger_PositiveTest() {
        boolean isInteger = NumberUtils.isInteger("12");
        Assert.assertTrue(isInteger);
    }

    @Test
    public void isInteger_NegativeTest() {
        boolean isInteger = NumberUtils.isInteger("2z2");
        Assert.assertFalse(isInteger);
    }
}