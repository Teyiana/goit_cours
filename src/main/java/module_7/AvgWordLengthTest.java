package module_7;

public class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    public double count(String phrase) {
        String[] newPhrase = phrase.split("\\s+");
        int length = 0;
        double count = 0;
        for (String s : newPhrase) {
            length += s.length();
            count++;
        }
        return length / count;
    }
}
