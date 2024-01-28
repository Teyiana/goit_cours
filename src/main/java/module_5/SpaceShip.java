package  module_5;
public class SpaceShip {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null
                && !name.strip().isBlank()
                && name.length() <= 100) {
            this.name = name;
        }
    }

    private String serialNumber;

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        if(serialNumber != null && serialNumber.length() == 8 && serialNumber.startsWith("SN")){
            this.serialNumber = serialNumber;
        }
    }

   public void printInfo(){
        String name = this.name;
        String seriaNun = this.serialNumber;
        String  s = String.format("Name is %s, serial number is %s", name, seriaNun);
        System.out.println(s);
   }

    public static void main(String[] args) {
          SpaceShip ship = new SpaceShip();
//        System.out.println(ship.getName()); //Should be null
//        ship.setName("Walker");
//        System.out.println(ship.getName()); //Should be Walker
//        ship.setName("");
//        System.out.println(ship.getName()); //Should be Walker, empty value ignored
//
//        ship.setName("Voyager ".repeat(100));
//        System.out.println(ship.getName()); //Should be

//        ship.setSerialNumber("SN506788");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788
//
//        ship.setSerialNumber("EE123456");
//        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
