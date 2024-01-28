package  module_5;
public class Engine {
    private  int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType(){
        return "A500";
    }



        public static void main(String[] args) {
//            Engine basicEngine = new Engine();
//            System.out.println(basicEngine.getFuelType()); //A500
//
//            Engine xFuelEngine = new XFuelEngine();
//            System.out.println(xFuelEngine.getFuelType()); //XFuel
            AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
            engine.setPower(1000);
            engine.setSerialNumber("SN504030");
            engine.printInfo(); //Serial number is SN504030, power is 1000
        }
    }
  class XFuelEngine extends Engine {
    protected String serialNumber;

      public void setSerialNumber(String serialNumber) {
          this.serialNumber = serialNumber;
      }

      @Override
    public String getFuelType() {
        return "XFuel";
    }
}
class  AdvancedXFuelEngine extends XFuelEngine{
    public void printInfo(){
        int pow = this.getPower();
        String seriaNun = this.serialNumber;
        String  s = String.format("Serial number is %s, power is %d", seriaNun, pow);
        System.out.println(s);

    }
}
