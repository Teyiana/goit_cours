package module_7;

public class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator{
    public String create(String text){
        if (text.length() <= 15) return text;
        String shortText = text.substring(0, 15);
        if(text.charAt(15) != ' '){
            shortText += "...";
        }
        return shortText;
    }
}