package  module_4;
import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");

        }

    }

    //    public void multiplyPrices(float[] prices) {
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < 1000) {
//                prices[i] *= 2;
//            } else {
//                prices[i] *= 1.5;
//            }
//        }
//    }
    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) return new int[0];
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
            if (prices[i] > maxValue) {
                maxValue = prices[i];
            }
        }
        if (maxValue == minValue) {
            return new int[]{maxValue};
        }
        return new int[]{minValue, maxValue};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                count = 0;
            }
            if (min == prices[i]) {
                count++;
            }
        }
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int length = prices.length;
        int[] result = new int[length];
        int j = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[j] = prices[i];
                j++;
            }
        }


        return Arrays.copyOf(result, j);
    }

    public int[] leavePrice9(int[] prices) {
        int length = prices.length;
        int[] result = new int[length];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                result[j] = prices[i];
                j++;
            }
        }
        return Arrays.copyOf(result, j);
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int length1 = showcaseStocks.length;
        int length2 = warehouseStocks.length;
        int sumLength = length1 + length2;
        String[] newArr = new String[sumLength];
        int j = 0;
        for (int i = 0; i < showcaseStocks.length; i++) {
            if (newArr[j] == null) {
                newArr[j] = showcaseStocks[i];
                j++;
            }
        }

        for (int k = 0; k < warehouseStocks.length; k++) {
            if (newArr[j] == null) {
                newArr[j] = warehouseStocks[k];
                j++;
            }
        }
        return newArr;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] >= minPrice && prices[i] <= maxPrice){
                sum += prices[i];
            }

        }
        return sum;
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[] {100f, 23.5f, 400f};
//        shop.printPrices(prices);
//        float[] prices = new float[]{100f, 1500f};
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));
//
//        int[] prices = new int[]{100, 1500, 300, 50};
//        int[] minMax = shop.findMinMaxPrices(prices);
//        System.out.println(Arrays.toString(minMax));
//        int[] prices = new int[]{150, 100, 200};
//        int toRemove = 100;
//        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
//        int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
//        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
//        String[] showcaseStocks = new String[]{"gun", "firebow"};
//        String[] warehouseStocks = new String[]{"firegun"};
//        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}
