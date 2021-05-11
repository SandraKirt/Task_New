package lv.ctco.task1;

public class NumberUtils {
    static boolean isInteger(Object object) {
        if (object instanceof Integer) {
            return true;
        } else {
            String string = object.toString();

            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
