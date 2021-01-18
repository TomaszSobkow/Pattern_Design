package vehicle.cars;

import vehicle.Vehicle;

public class PassengerCars extends Vehicle {

    public PassengerCars(String brand, String model, int engineSize) {
        super(brand, model, engineSize);
    }

    @Override
    public String toString() {
        System.out.printf("%-15s %-20s %-15s %-20s %-15s %-20d",
                "\nBrand:", getBrand(),
                "\nModel:", getModel(),
                "\nEngine:", getEngineSize());
        return "";
    }
}
