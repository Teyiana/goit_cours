package  module_4;
import java.util.Arrays;

public class ArlanHelper {
    public String drawQuad(int n) {
        String[] rows = new String[n];
        int i = 0;
        while (i < n) {
            String row = "";
            int j = 0;
            while (j < n) {
                j++;
                row += "*";
            }
            rows[i] = row;
            i++;
        }
        return String.join("\n", rows);
    }


    public String drawRect(int width, int height, char c) {
        String[] rows = new String[height];
        int i = 0;
        while (i < height) {
            String row = "";
            int j = 0;
            while (j < width) {
                j++;
                row += c;
            }
            rows[i] = row;
            i++;
        }
        return String.join("\n", rows);
    }

    public String drawLine(int length) {
        String rows ="";
        int i = 0;
        while (i < length) {
            if (i % 2 == 0) {
                rows += "*";
            } else {
                rows += "#";
            }
            i++;
        }
        return  rows;
    }

    public String drawPattern(char[] pattern, int repeatCount){

        int i = 0;
        String row = "";
        while (i < repeatCount){
            row = String.valueOf(pattern);
            i++;
        }
        return row;

    }

    //Test output
    public static void main(String... args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
//        System.out.println(helper.drawQuad(2));
//        System.out.println(helper.drawRect(2, 3, 'X'));
//        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
