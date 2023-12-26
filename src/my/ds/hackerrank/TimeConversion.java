package my.ds.hackerrank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String timeConversion(String s) {
        Date date = null;

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
        try {
            date = parseFormat.parse(s);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return displayFormat.format(date);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
