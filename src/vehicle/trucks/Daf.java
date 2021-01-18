package vehicle.trucks;

import vehicle.interfaces.Consumption;
import vehicle.interfaces.Speed;

public class Daf extends Trucks {

    public Daf(String brand, String model, int engineSize, String drive) {
        super(brand, model, engineSize, drive);
        consumption = new Consumption();
        speed = new Speed();
    }


}
