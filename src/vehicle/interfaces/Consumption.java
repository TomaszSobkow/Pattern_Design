package vehicle.interfaces;

public class Consumption implements ConsumptionInterface{
    @Override
    public float consumption(float consumption) {


        System.out.printf("%-15s %-4.2f %-8s",
                          "\nConsumption:", consumption,"L/100km");
        return consumption;
    }
}
