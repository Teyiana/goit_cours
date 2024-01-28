package  module_6;
import java.util.Arrays;
public class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder{
    private int[][] targets;
    private int[] aiCoords;

    public int[] getAiCoords() {
        return aiCoords;
    }

    public void setAiCoords(int[] aiCoords) {
        this.aiCoords = aiCoords;
    }

    public int[][] getTargets() {
        return targets;
    }

    public void setTargets(int[][] targets) {
        this.targets = targets;
    }


    public int[] findTarget(int[] aiCoords, int[][] targets){
        int[] result = null;
        double min = Double.MAX_VALUE;

        for (int[] target : targets) {
            double a = aiCoords[0] - target[0];
            double b = aiCoords[1] - target[1];
            double c = Math.sqrt(a * a + b * b);
            if (c < min) {
                min = c;
                result = target;
            }
        }
        return result;
    }
}
