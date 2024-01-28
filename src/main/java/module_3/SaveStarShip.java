package  module_3;
import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
        String[] miaru = {"Maux", "Reux", "Piax"};
        String[] milkyWay = {"Earth", "Mars", "Jupiter"};
        String[] dangerBanger = {"Fobius", "Demius"};

        if (galaxy.equals("Miaru")) {
            return miaru;
        } else if (galaxy.equals("Milkyway")) {
            return milkyWay;
        } else if (galaxy.equals("DangerBanger")) {
            return dangerBanger;
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return count * 70;
        } else if (fuel.equals("STAR500")) {
            return count * 120;
        } else if (fuel.equals("STAR1000")) {
            return count * 200;
        } else {
            return count * 50;
        }
    }

    public int roundSpeed(int speed) {
        double n = speed;

        return (int) Math.round(n / 10) * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        } else {
            return (distance - 20) * 5 + 1000;
        }
    }

//    public void calculateMaxPower() {
//        Scanner scanner = new Scanner(System.in);
//        int powerOne = scanner.nextInt();
//        int powerTwo = scanner.nextInt();
//        int powerThree = scanner.nextInt();
//        scanner.close();
//        double max = Math.max(powerOne, Math.max(powerTwo, powerThree));
//        if (max < 10) {
//            max = max * 0.7f;
//        } else if (max > 100) {
//            max = max * 2.1f;
//        } else {
//            max = max * 1.2f;
//        }
//        System.out.println( max);
//    }

    public String getMyPrizes(int ticket) {
        if (ticket % 10 == 0 && ticket > 200) {
            return "crystall coin";
        } else if (ticket > 200 && (ticket % 10) == 7) {
            return "chip coin";
        } else if ((ticket % 10) == 7) {
            return "chip";
        } else if (ticket > 200) {
            return "coin";
        } else if (ticket % 10 == 0) {
            return "crystall";
        } else {
            return "";
        }
    }
    public boolean isHangarOk(int side1, int side2, int price){
        int s = side1 * side2;
        double pm2 = (double) price / s;
        int maxSide = Math.max(side1, side2);
        int minSide = Math.min(side1, side2);
        return s >= 1500 && maxSide <= (minSide * 2) && pm2 <= 1000;
    }


    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        System.out.println(ship.choosePlanet(10));

        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        System.out.println(ship.roundSpeed(55));
        System.out.println(ship.calculateNeededFuel(21));
        // ship.calculateMaxPower();
        System.out.println(ship.getMyPrizes(250));
        System.out.println(ship.isHangarOk(100, 75, 1000000));

    }
}
