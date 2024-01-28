package module_7;

public class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class  PalindromeCounter{
    public int count(String phrase){
        String[] row = phrase.split("\\s+");
        int count = 0;
        for (String word : row) {
             if(isPolindrom(word)){
                 count++;
             }
        }
        return  count;
    }

    private boolean isPolindrom(String word) {
        if (word == null || word.isEmpty()) return false;
        int length = word.length();
        if (length == 1) return true;
        char [] chars = word.toLowerCase().toCharArray();
        for (int i = length / 2; i >= 0; i--) {
            if (chars[i] != chars[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
