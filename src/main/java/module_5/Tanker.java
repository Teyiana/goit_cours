package  module_5;
public class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected  String getFuelType(){
        return "A500";
    }

    public void refuel(int amount){
        String seriaN = this.serialNumber;
        String type = getFuelType();

        String s = String.format("Add %d of %s, tanker serial number is %s", amount, type, seriaN);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);

    }
}

class XFuelTanker extends Tanker{
    @Override

    protected String getFuelType(){
        return  "XFuel";
    }

}

class MX200Tanker extends Tanker{
    @Override
    protected String getFuelType(){
        return  "MX200";
    }
}
