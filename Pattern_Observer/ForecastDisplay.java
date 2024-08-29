package Pattern_Observer;

public class ForecastDisplay implements Observer,DisplayElement{
    private float currentPressure=29.92f;
    private float lastPressure;;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.lastPressure=this.currentPressure;
        this.currentPressure=weatherData.getPressure();
        display();
    }
    public void display(){
        System.out.println("Current pressure: " + currentPressure
                + "  and " + lastPressure + " last pressure");
    }
}
