import java.util.Scanner;

public class CondutionalsLessons3 {
    public static void main(String[] args) {
//        if (true) {
//            System.out.println("Value is true");
//        } else if (false) {
//            System.out.println("Second value is true");
//        } else {
//            System.out.println("Value is true");
//        }
        Scanner scanner = new Scanner(System.in);
        boolean isCommented = false;
        boolean isReposted = false;
        boolean isSubscribed = false;

        System.out.println("Чи підписався на сторінку?");
        String isSubscribedResponse = scanner.next();
        if(isSubscribedResponse.equalsIgnoreCase("yes")){
            isSubscribed = true;
        }
    }
}
