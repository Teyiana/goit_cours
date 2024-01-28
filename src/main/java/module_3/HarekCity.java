package  module_3;
import java.util.*;
public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {

        int[] result = {age1, age2, age3, age4};
        return result;
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " " + "AND" + " " + names[9] + " " + "TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String s1 = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = s1;
    }

    public String[] changeElectResultAgain(String[] results) {
        String[] s = new String[3];
        s[0] = results[2];
        s[1] = results[3];
        s[2] = results[4];
        return s;
    }

    public char[][] createKeyboard() {

        return new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};

    }

    public void printKeyboard() {
        char[][] keyboard = createKeyboard();
        for (char[] chars : keyboard) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public String[] makeCopy(String[] names){
        String[] result = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return result;
    }



    public static void main(String[] args) {
        // String[] arr = new HarekCity().createEmptyNameArray();
        // System.out.println(Arrays.toString(arr));
        // int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        // System.out.println(Arrays.toString(ageArray));

        //  String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        //String[] toReplace = new String[]{"lopr", "boki"};
        // new HarekCity().fixNames(names, toReplace);
        // System.out.println(Arrays.toString(names));

        // String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        //  System.out.println(new HarekCity().firstAndLastTogether(names));
        //  String[] results = new String[]{"miho", "hut"};
        // new HarekCity().changeElectResult(results);
        // System.out.println(Arrays.toString(results));
        //String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        // String[] changedResults = new HarekCity().changeElectResultAgain(results);
        //System.out.println(Arrays.toString(changedResults));
        //HarekCity h = new HarekCity();
        //char[][] keyboard = h.createKeyboard();
        //for (int i = 0; i < keyboard.length; i++) {
            //System.out.println(Arrays.toString(keyboard[i]));
       // }
       // h.printKeyboard();

        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}

