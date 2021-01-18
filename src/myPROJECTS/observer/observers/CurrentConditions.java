package myPROJECTS.observer.observers;

import myPROJECTS.observer.WeatherData;
import myPROJECTS.observer.interfacese.Customer;
import myPROJECTS.observer.interfacese.DisplayElement;
import myPROJECTS.observer.interfacese.Subject_Obserwowany;

public class CurrentConditions  implements Customer , DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject_Obserwowany subject_obserwowany;

    public  CurrentConditions(WeatherData weatherData){

    }





    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public String display() {
        return "CurrentCondition class";
    }
}
