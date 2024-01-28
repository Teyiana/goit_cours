
public class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));
    }
}


class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }


    public LevelInfo getLevelInfo() {
        return levelInfo;
    }

    public void setLevelInfo(LevelInfo levelInfo) {
        this.levelInfo = levelInfo;
    }


    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("Quarke level, name is %s, difficulty is %s, point count is %s",
                getLevelInfo().getName(), levelInfo.difficulty, points.length);

    }

    public int calculateLevelHash() {
        int sum = 0;
        for (Point p : points) {
            sum += p.x * p.y;
        }
        return sum;
    }

    static class LevelInfo {
        private String name;

        public String getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        private String difficulty;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        @Override
        public String toString() {
            return "LevelInfo{" +
                    "name='" + name + '\'' +
                    ", difficulty='" + difficulty + '\'' +
                    '}';
        }
    }

    public static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}

//class Level1 {
//    private int width;
//    private int height;
//
//    public Level1(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//}
//
//class Level1Loader {
//    public void load(Level level) {
//        System.out.println("Level loaded");
//    }
//}
//
//class Level1LoaderTest {
//    public static void main(String[] args) {
//        //Level loaded
//        try {
//            new Level1Loader().load(new Level(10, 20));
//        } catch (LevelTooBigException ex) {
//            System.out.println("Level too big");
//        }
//
//        //Level too big
//        try {
//            new Level1Loader().load(new Level(10000, 2000));
//        } catch (LevelTooBigException ex) {
//            System.out.println("Level too big");
//        }
//    }
//}
