package module_7;

public class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class  WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        if(!isCreate(sourceWord, targetWord)){
            return false;
        }
        return true;
    }

    private boolean isCreate(String sourceWord, String targetWord) {
        char[] charsSource = sourceWord.toLowerCase().toCharArray();
        char[] charsTarget = targetWord.toLowerCase().toCharArray();
        boolean result = false;
        for (int i = 0; i < charsSource.length; i++) {
            for (int j = 0; j < charsTarget.length; j++) {
                if(charsSource[i] == charsTarget[j]){
                    return true;
                }
            }
        }
        return result;
    }
}
