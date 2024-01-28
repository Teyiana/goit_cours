package module_6;

public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea extends RectangleAreaTest{
    private int[] coords;

    public int[] getCoords() {
        return coords;
    }

    public void setCoords(int[] coords) {
        this.coords = coords;
    }


    public RectangleArea(int[] coords){
        this.coords = coords;

    }

    public int getArea() {

        int x1 = this.coords[0] - this.coords[2];
        int y1 = this.coords[1] - this.coords[3];

            return Math.abs(x1) * Math.abs(y1);

    }
}
