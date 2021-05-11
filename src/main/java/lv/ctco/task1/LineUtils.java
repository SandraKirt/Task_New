package lv.ctco.task1;

import java.util.List;

public class LineUtils {
    static String concatAllTextLines(List<String> lines){
        String concatString = "";
        for (String line: lines) {
            if (!NumberUtils.isInteger(line)){
                concatString += line;
            }
        }
        return concatString;
    }

    static int sumAllNumberLines(List<String> lines){
        int sum = 0;
        for (String line: lines) {
            if (NumberUtils.isInteger(line)) {
                sum += Integer.parseInt(line);
            }
        }
        return sum;
    }

    static int countEvenNumberLines(List<String> lines){
        int count = 0;
        for (String line : lines){
            if (NumberUtils.isInteger(line)) {
                if (Integer.parseInt(line)%2 ==0) {
                    count++;
                }
            }
        }
        return count;
    }
}
