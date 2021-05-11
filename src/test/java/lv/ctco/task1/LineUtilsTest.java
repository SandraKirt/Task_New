package lv.ctco.task1;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class LineUtilsTest {

    private static List<String> testLines = null;
    private static final String INPUT_FILE_NAME = "InputFile.txt";

    @BeforeClass
    public static void inputData() throws IOException {
        ClassLoader classLoader = LineUtilsTest.class.getClassLoader();
        File file = new File(classLoader.getResource(INPUT_FILE_NAME).getFile());
        testLines = FileUtils.readLines(file, StandardCharsets.UTF_8);
    }

    @Test
    public void concatAllTextLinesTest() {
        String concatedLines = LineUtils.concatAllTextLines(testLines);
        Assert.assertEquals("aaaabbbbcccf5f", concatedLines);
    }

    @Test
    public void sumAllNumberLinesTest() {
        int sum = LineUtils.sumAllNumberLines(testLines);
        Assert.assertEquals(31, sum);
    }

    @Test
    public void countEvenNumberLinesTest() {
        int count = LineUtils.countEvenNumberLines(testLines);
        Assert.assertEquals(2, count);
    }
}
