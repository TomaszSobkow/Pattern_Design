package observer;

import observer.interfacese.CurrentConditions;
import observer.interfacese.Forecast;
import observer.interfacese.ObjectBeingObserved;
import observer.interfacese.Statistics;

public class WeatherData  {



    private CurrentConditions currentConditions;
    private Forecast forecast;
    private Statistics statistics;

    public float downloadTemperature(){ return 0; }
    public float downloadHumidity(){ return 0; }
    public float downloadPressure(){ return 0; }

    public void readChanges(){
        float temp = downloadTemperature();
        float humidity = downloadHumidity();
        float pressure = downloadPressure();

        currentConditions.update(temp,humidity,pressure);
        forecast.update(temp,humidity,pressure);
        statistics.update(temp,humidity,pressure);
    }




}
