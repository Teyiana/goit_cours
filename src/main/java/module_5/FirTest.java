package  module_5;
public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();

        //Should be 20
        System.out.println(firTest.test(firNum, 9));
    }
}
class  FirNum{
    public int calc(int n){
        return Math.abs(n);
    }
}
class FirNumSum extends FirNum{
    @Override
    public int calc(int n){

        return n * (n + 1) / 2;
    }
}

class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }

}

class  FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            if(!(i % 2 == 0)){
                sum = sum * i;
            }
        }
return sum;
    }
}
class  FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 ^ i % 5 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}

class  FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                sum = sum + i / 2;
            }
        }
        return sum;
    }
}








