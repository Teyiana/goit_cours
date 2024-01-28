package  module_4;
public class ATM {

    public int countBanknotes(int sum){
        int [] coin = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while (sum > 0){
            count = count + sum / coin[i];
            sum = sum % coin[i];
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(1775));
    }
}
