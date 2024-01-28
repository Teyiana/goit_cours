package  module_5;
public class Stars {

    private int count;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


    public String countStars(int count){
        int [] coin = new int[] {1000, 100, 10, 1};
        String [] symbols = new String[] {"X", "Y", "Z", "*"};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (count > 0){
            result.append(symbols[i].repeat(count / coin[i]));
            count = count % coin[i];
            i++;
        }
        return result.toString();
    }
    @Override
    public String toString() {
        String s = countStars(count);
        return s;

    }





    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}
