package vehicle.cars;

import vehicle.interfaces.Consumption;
import vehicle.interfaces.Speed;

public class Toyota extends PassengerCars{

    private  String engineType ;

    public Toyota(String brand, String model, int engineSize, String engineType) {
        super(brand, model, engineSize);

        if(model.equalsIgnoreCase("auris")) this.engineType = "Hibrid";
        if(model.isEmpty())this.engineType = engineType;

        engineType = this.engineType;

        consumption = new Consumption();
        speed = new Speed();
    }

    @Override
    public String toString() {
        System.out.printf("%-15s %-20s %-15s %-20s %-15s %-20d %-15s %-20s",
                "\nBrand:", getBrand(),
                "\nModel:", getModel(),
                "\nEngine:", getEngineSize(),
                "\nType:", getEngineType());
        return "";
    }

    public String getEngineType() {
        return engineType;
    }
}
