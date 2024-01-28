package  module_6;
public class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
class TexturePool{
    private static TexturePool instance = new TexturePool();
    private TexturePool(){

    }

    public static TexturePool getInstance() {
        if (instance == null) {
            instance = new TexturePool();
        }
        return instance;
    }
    public String getTexture(String textureName){
        String s = "Get texture " + textureName;
        return s;
    }
}
