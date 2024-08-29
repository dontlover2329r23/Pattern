package Pattern_Observer;

public class CurrentConditionsDisplay  implements Observer,DisplayElement{
    private float temperature;
    private float pressure;
    private WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature=weatherData.getTemperature();
        this.pressure=weatherData.getPressure();
        display();
    }
    public void display(){
        System.out.println("Current conditions: " + temperature
                + " degrees and " + pressure + " pressure");
    }
}
