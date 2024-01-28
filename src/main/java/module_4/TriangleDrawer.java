package  module_4;
public class TriangleDrawer {
    public String drawTriangle(int size) {
        String[] rows = new String[size];
        int i = 0;
        while (i < size) {
            rows[i] = "*".repeat(size - i);
            i++;
        }
        return String.join("\n", rows);
    }

    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(triangleDrawer.drawTriangle(3));

    }
}
