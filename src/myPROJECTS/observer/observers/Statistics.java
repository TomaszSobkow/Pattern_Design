package myPROJECTS.observer.observers;

import myPROJECTS.observer.WeatherData;
import myPROJECTS.observer.interfacese.Customer;
import myPROJECTS.observer.interfacese.DisplayElement;

public class Statistics extends WeatherData implements Customer,  DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public String display() {
        return "Statistics Class";
    }
}
