package module_7;

public class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall{
    public String calculate(String text){

        char[] chars = text.toCharArray();
        int countBigLetter = 0;
        int countSmallLetter = 0;
        for( char c : chars){
            if(c >= 'A' && c <= 'Z'){
                countBigLetter++;
            }
            if(c >= 'a' && c <= 'z'){
                countSmallLetter++;
            }

        }
        String result = " ";
        if(countBigLetter > countSmallLetter){
            return result = "Big";
        }
        if(countSmallLetter > countBigLetter ){
            return result = "Small";
        }
        if(countSmallLetter == countBigLetter ){
            return result = "Same";
        }
        return result;
    }
}
