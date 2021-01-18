package vehicle.interfaces;

public class Speed implements SpeedInterface {

    @Override
    public int maxSpeed(int speed) {
        System.out.printf("%-14s %-3d %-4s",
                          "MAX speed:",speed,"km/h");
        return speed;
    }
}
