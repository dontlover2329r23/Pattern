package Pattern_Observer;

import java.util.ArrayList;

public class WeatherData  implements Subject{
    private ArrayList<Observer> Observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        Observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        Observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        Observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:Observers){
            observer.update();
        }
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.pressure=pressure;
        this.humidity=humidity;
        this.temperature=temperature;
        notifyObservers();
    }
    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }
}
