package module_7;

public class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {
    public int count(String text) {
        String[] newPhrase = text.split("\\s+");
        int count = 0;
        String[] upperAlphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] lowerAlphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < newPhrase.length; i++) {
            for (int j = 0; j < upperAlphabet.length; j++) {
                for (int k = 0; k < lowerAlphabet.length; k++) {
                    if (newPhrase[i].length() >= 2 && newPhrase[i].startsWith(upperAlphabet[j])
                            && newPhrase[i].endsWith(lowerAlphabet[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

