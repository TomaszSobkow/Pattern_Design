package vehicle.trucks;

import vehicle.Vehicle;

public abstract class Trucks extends Vehicle {

    private String drive;

    public Trucks(String brand, String model, int engineSize, String drive){
        super(brand, model, engineSize);
        this.drive = drive;
    }


     public void showCar() {
        System.out.println("");
    }

    @Override
    public String toString() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-5d %-15s %-10s %-10s",
                "\nBrand :", getBrand(),
                "\nModel :", getModel(),
                "\nEngine:", getEngineSize(),"ccm",
                "\nDrive :", getDrive());
        System.out.println("\n"+getClass().toString().substring(getClass().toString().lastIndexOf('.')+1));
        return "";
    }

    public String getDrive() {
        return drive;
    }
}
