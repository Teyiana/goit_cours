package  module_4;
import static java.lang.Integer.*;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        int num;
        String[] s;
        String result = "";
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] != null) {
                s = stocks[i].split(" ");
                num = parseInt(s[1]);
                if(num < 200){
                    result += s[0] + " ";
                }
            }
        }
        if (result.length() > 0) return result.substring(0, result.length()-1);
        return "";
    }

    public static void main(String[] args) {
        CheapStocks cheap = new CheapStocks();

        String[] s = new String[]{"gun 500", "firebow 70", "pixboom 200", "cap 50"};
        System.out.println(cheap.getCheapStocks(s));

    }
}
