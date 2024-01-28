package module_7;

public class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter{
    public String remove(String phrase, String[] words){

        String[] row = phrase.split("\\s+");
        String newRow = " ";
        for (String word : row) {
            if (!test(word, words)) {
                newRow = newRow + word  + " ";
            }
        }
        return newRow.trim();
    }

    private boolean test(String toTest, String[] valid) {
        for (int j = 0; j < valid.length; j++) {
            if(toTest.equals(valid[j])){
                return true;
            }
        }
        return false;
    }
}
