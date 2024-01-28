package module_7;

public class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));

        System.out.println(new EmailDetector().isPresent( "ifd it giap fy"));

        System.out.println(new EmailDetector().isPresent( "@ifd it@giap fy"));

        System.out.println(new EmailDetector().isPresent( "@ifd it giap fy@"));
    }
}

class EmailDetector{
    public boolean isPresent(String text){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '@'){
                if (isEmail(i, chars)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isEmail(int atIndex, char[] chars) {
        if (atIndex < 2 || atIndex >= chars.length - 2) return false;
        for (int i = atIndex - 1; i > atIndex - 3; i--) {
            if (chars[i] == ' ') {
                return false;
            }
        }
        for (int i = atIndex + 1; i < atIndex + 3; i++) {
            if (chars[i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
