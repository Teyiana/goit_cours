package  module_3;
public class CaptainDispute {
    public String evenOrOdd(int number) {

        return number%2 == 0 ? "even": "odd";
    }
    public int findMin(int[] triple){
     return Math.min(triple[0], Math.min(triple[1], triple[2]));

    }

    public int translate(String romanNumber){

        switch (romanNumber.toUpperCase().trim()){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            default:
                return  -1;
        }
    }

    public static void main(String[] args) {
        CaptainDispute captainDispute = new CaptainDispute();

        //Should be even
        //System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));
    }
}
