package  module_6;

public class Bullet {
    static {
        System.out.println("Bullet created!");
    }

}

class BulletTest {
    public static void main(String[] args) {
        new Bullet();
        new Bullet();
    }
}
