package myPROJECTS.vehicle.cars;

import myPROJECTS.vehicle.interfaces.Consumption;
import myPROJECTS.vehicle.interfaces.Speed;

public class BMW extends PassengerCars {

    public BMW(String brand, String model, int engineSize){
        super(brand, model, engineSize);

        consumption = new Consumption();
        speed = new Speed();
    }
}

