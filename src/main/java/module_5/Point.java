package  module_5;
import java.util.Objects;

//public class Point {
//    private int x;
//    private int y;
//    private int z;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int getZ() {
//        return z;
//    }
//
//    public void setZ(int z) {
//        this.z = z;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Point other)) return false;
//        return this.x == other.x
//                && this.y == other.y
//                && this.z == other.z;
//    }
//
//    @Override
//    public int hashCode(){
//       return Objects.hash(x, y, z);
//    }
//
//}


abstract class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);


        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
    }

}
