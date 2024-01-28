package  module_5;
public abstract class  Passenger{
    public abstract String getType();


    public abstract int getTicketPrice();

    public static void main(String[] args) {

    }
}

class vipPassenger extends Passenger {
    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getTicketPrice() {
        return 0;
    }
}
 class RegularPassenger extends Passenger{
     @Override
     public String getType() {
         return "Regular";
     }

     @Override
     public int getTicketPrice() {
         return 199;
     }
 }

class VIPPassenger extends Passenger{
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}