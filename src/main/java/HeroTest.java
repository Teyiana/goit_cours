public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }

}
class  Hero extends HeroTest{
    private final String name;
    private final int hp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }


    public Hero(String name, int hp){
        if(hp < 0) {
            this.hp = 0;
        } else if (hp > 200) {
            this.hp = 200;
        }else {
            this.hp = hp;
        }
            this.name = name;
    }
    public Hero(){
        this("Paratrooper", 100);

    }
}
