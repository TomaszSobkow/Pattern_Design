package observer;

import javax.swing.*;

public class AppWeather {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, new WeatherData().downloadHumidity());
    }
}
