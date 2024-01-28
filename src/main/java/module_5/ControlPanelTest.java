package  module_5;
public class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
class Altimeter extends ControlPanelTest{
    @Override
    public String toString(){
        return "Measure height";
    }
}
class  AirGauge extends ControlPanelTest{
    @Override
    public  String toString(){
        return "Measure air pressure";
    }
}

class ControlPanel{
    private final Altimeter altimeter = new Altimeter();
    private final AirGauge airGauge = new AirGauge();
    public void control(){
        System.out.println(altimeter.toString());
        System.out.println(airGauge.toString());
    }
}