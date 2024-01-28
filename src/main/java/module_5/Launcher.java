package  module_5;
public class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

 class  Spaceport extends Launcher{
    private final GasStation gasStation = new GasStation();
    private final ServiceTower serviceTower = new ServiceTower();
    private final CompressorStation compressorStation = new CompressorStation();
    private final Radar radar = new Radar();
    private final CommandPost commandPost = new CommandPost();

     public void launch(){
         gasStation.refuel();
         serviceTower.service();
         compressorStation.compress();
         radar.scan();
         commandPost.command();
     }
}

class GasStation extends Launcher{
    public void refuel(){
        System.out.println("Refuel done!");
    }
}

class  ServiceTower extends Launcher{
    public void service(){
        System.out.println("Service done!");
    }
}
class  CompressorStation extends Launcher{
    public void compress(){
        System.out.println("Compress done!");
    }
}

class Radar extends Launcher{
    public void scan(){
        System.out.println("Scan done!");
    }
}

class CommandPost extends Launcher{
    public void command(){
        System.out.println("Fire!");
    }
}