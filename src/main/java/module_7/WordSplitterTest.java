package module_7;
import java.util.Arrays;

    class WordSplitterTest {
        public static void main(String[] args) {
            WordSplitter wordSplitter = new WordSplitter();

            String[] words = wordSplitter.split("Hello      world");

            //[hello, world]
            System.out.println(Arrays.toString(words));
        }
    }


class WordSplitter{
    private String phrase;

    public WordSplitter() {

    }

    WordSplitter(String phrase) {
        this.phrase = String.valueOf(phrase);
    }

    public String[] split(String phrase){
        String s = phrase.toLowerCase();
        String[] row = s.split("\\s+");
      return row;
    }
}