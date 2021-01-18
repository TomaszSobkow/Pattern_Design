package myPROJECTS.vehicle.trucks;

import myPROJECTS.vehicle.interfaces.Consumption;
import myPROJECTS.vehicle.interfaces.Speed;

public class Iveco extends Trucks {

    public Iveco(String brand, String model, int engineSize, String drive) {
        super(brand, model, engineSize,drive);

        consumption = new Consumption();
        speed = new Speed();
    }


}
