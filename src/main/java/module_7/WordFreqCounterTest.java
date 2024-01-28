package module_7;

public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
class  WordFreqCounter{
    public float countFreq(String phrase, String word){
        String s = phrase.toLowerCase();
        String[] row = s.split("\\s+");
        float count = 0.0F;
        int sum = row.length;
        for (int i = 0; i < row.length; i++) {
            if(row[i].equals(word.toLowerCase())){
                count++;
            }
        }
        return count / sum;
    }
}
