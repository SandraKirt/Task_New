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
    String t = null;
    static List<String> testLines = null;

    @BeforeClass
    public static void inputData() throws IOException {
        String path = "C:\\Users\\sandra.kirtovska\\IdeaProjects\\Task1\\src\\test\\resources\\InputFile.txt";
        File inputFile = new File(path);
        testLines = FileUtils.readLines(inputFile, StandardCharsets.UTF_8);
    }

    @Test
    public void concatAllTextLinesTest(){
        String expert = "aaaabbbbcccf5f";
        t = LineUtils.concatAllTextLines(testLines);
        System.out.println(t);
        Assert.assertEquals("Concat all text lines", expert, t);
        System.out.println("concatAllTextLines is as expected " + "aaaabbbbcccf5f");
    }

    @Test
    public void sumAllNumberLinesTest() {
        int c = LineUtils.sumAllNumberLines(testLines);
        Assert.assertEquals(31, c);
        System.out.println("sumAllNumberLines is as expected " + 31);
    }

    @Test
    public void countEvenNumberLinesTest(){
        int c = LineUtils.countEvenNumberLines(testLines);
        Assert.assertEquals(2, c);
        System.out.println("countEvenNumberLines is as expected " + c);
    }
}
