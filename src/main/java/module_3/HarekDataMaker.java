package  module_3;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;

public class HarekDataMaker {


    public String aggregateSingle(String name, String age, String planet) {
        return String.format("name - %s, age - %s, planet - %s", name, age, planet);
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String first = aggregateSingle(names[0], String.valueOf(ages[0]), planets[0]);
        String second = aggregateSingle(names[1], String.valueOf(ages[1]), planets[1]);
        String third = aggregateSingle(names[2], String.valueOf(ages[2]), planets[2]);
        String[] s = new String[]{first, second, third};


        return s;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};
        String[] s = new HarekDataMaker().aggregateAll(names, ages, planets);
        for (String r : s){
            System.out.println(r);
        }
    }
}
