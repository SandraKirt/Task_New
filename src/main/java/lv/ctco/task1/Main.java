package lv.ctco.task1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String path;

        if (args.length == 0 || args[0].isEmpty()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter input file name with full path to it : ");
            path = input.nextLine();
        } else {

            path = args[0];
        }
        System.out.println("This is path to input text file " + path);


        File inputFile = new File(path);
        List<String> lines = FileUtils.readLines(inputFile, StandardCharsets.UTF_8);

        String concatAll = LineUtils.concatAllTextLines(lines);
        System.out.println();
        System.out.println("1. All text lines are concatenated to one: " + concatAll);

        int sum = LineUtils.sumAllNumberLines(lines);
        System.out.println();
        System.out.println("2. Total is " + sum);

        int c = LineUtils.countEvenNumberLines(lines);
        System.out.println();
        System.out.println("3. The number of even numbers is " + c);

    }

}
