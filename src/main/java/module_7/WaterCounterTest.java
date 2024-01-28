package module_7;

public class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter{
    public double count(String text){
        char[] chars = text.toCharArray();
        double length = chars.length;
        double count = 0.0;
        for (char c : chars){
            if(c == ' '){
                count++;
            }
        }
        return count/length;
    }
}
