package vehicle;

import vehicle.interfaces.ConsumptionInterface;
import vehicle.interfaces.SpeedInterface;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int engineSize;

    protected SpeedInterface speed;
    protected ConsumptionInterface consumption;

    public Vehicle(){}
    public Vehicle(String brand, String model, int engineSize){
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
    }

    //public abstract void showVehicle();

    public void setSpeed(int setSpeed){
        speed.maxSpeed(setSpeed);
        }

    public void setConsumption(float setConsumption){
        consumption.consumption(setConsumption);
    }

    public String getBrand() {
        return getClass().toString().substring(getClass().toString().lastIndexOf('.')+1);
    }

    public String getModel(){
        return model;
    }

    public int getEngineSize(){
        return engineSize;
    }
}
