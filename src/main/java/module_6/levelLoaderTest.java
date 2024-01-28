package  module_6;

public class levelLoaderTest {
    //    public static void main(String[] args) {
//        LevelLoader levelLoader = LevelLoader.getInstance();
//
//        //Loading level Startlevel ...
//        System.out.println(levelLoader.load("StartLevel"));
//    }
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(levelLoader.getInstance().load("StartLevel"));
    }
}

class levelLoader {
    private static levelLoader instance = new levelLoader();

    public static levelLoader getInstance() {
        if (instance == null) {
            instance = new levelLoader();
        }
        return instance;
    }
        public String load (String levelName){
            return "Loading level " + levelName + " ...";
        }

}

//    }
        //    private static LevelLoader levelLoader;
//    private LevelLoader(){
//    }
//    public static LevelLoader getInstance() {
//        if(levelLoader == null){
//            levelLoader = new LevelLoader();
//        }
//        return levelLoader;
//    }
//
//    String load(String levelName){
//        String s = "Loading level " + levelName + " ...";
//        return s;
//    }
