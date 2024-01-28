package module_7;

public class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter{
    public int count(String phrase) {
        int count = phrase.length() - phrase.replaceAll("\\p{Punct}", "").length();
        return count;
    }

}
