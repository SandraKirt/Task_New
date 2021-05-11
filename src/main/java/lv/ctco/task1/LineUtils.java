package lv.ctco.task1;

import java.util.List;

public class LineUtils {
    protected static String concatAllTextLines(List<String> lines){
        String concatString = "";
        for (int p = 0; p < lines.size(); p++) {
            if (!NumberUtils.isInteger(lines.get(p))) {
                concatString += lines.get(p);
            }
        }
        return concatString;
    }

    protected static int sumAllNumberLines(List<String> lines){
        int sum = 0;
        for (int j = 0; j < lines.size(); j++) {
            if (NumberUtils.isInteger(lines.get(j))) {
                sum += Integer.parseInt(lines.get(j));
            }
        }
        return sum;
    }

    protected static int countEvenNumberLines(List<String> lines){
        int c = 0;
        for (int n = 0; n < lines.size(); n++){
            if (NumberUtils.isInteger(lines.get(n))) {
                if (Integer.parseInt(lines.get(n))%2 ==0) {
                    c++;
                }
            }
        }
        return c;
    }
}
