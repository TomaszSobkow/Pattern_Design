package vehicle.cars;

import vehicle.interfaces.Consumption;
import vehicle.interfaces.Speed;

public class Mercedes extends PassengerCars {

    public Mercedes(String brand, String model, int engineSize){
        super(brand, model, engineSize);
        consumption = new Consumption();
        speed = new Speed();
    }
}
