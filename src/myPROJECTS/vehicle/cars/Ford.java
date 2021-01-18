package myPROJECTS.vehicle.cars;

import myPROJECTS.vehicle.interfaces.Consumption;
import myPROJECTS.vehicle.interfaces.Speed;

public class Ford extends PassengerCars {

    public Ford(String brand, String model, int engineSize){
        super(brand, model, engineSize);
        consumption = new Consumption();
        speed = new Speed();
    }
}
