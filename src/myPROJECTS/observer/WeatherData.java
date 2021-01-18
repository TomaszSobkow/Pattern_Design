package myPROJECTS.observer;

import myPROJECTS.observer.interfacese.Customer;
import myPROJECTS.observer.interfacese.Subject_Obserwowany;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherData implements Subject_Obserwowany {

    private List<Object> customers;

   private float temperature;
   private float humidity;
   private float pressure;

   private float downloadTemperature;
   private float downloadHumidity;
   private float downloadPressure;

   public WeatherData(){
       this.customers = new ArrayList();
   }

    @Override
    public void registerCustomer(Customer cu) {
       customers.add(cu);
    }

    @Override
    public void deleteCustomer(Customer cu) {
        int customerPosition = customers.indexOf(cu);
        if(customerPosition >= 0) customers.remove(customerPosition);
    }

    @Override
    public void customerNotification() {
            for(int index = 0; index < customers.size(); index++){
                Customer customer = (Customer) customers.get(index);
                customer.update(temperature,humidity,pressure);
            }
    }

    public void readChanges(){
       customerNotification();
    }

    public void setDataFromSensors(float temperature, float humidity, float pressure){
       this.temperature = temperature;
       this.humidity = humidity;
       this.pressure = pressure;
       readChanges();
    }

}
