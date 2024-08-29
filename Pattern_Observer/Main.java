package Pattern_Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        weatherData.setMeasurements(12f,23f,65f);
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10f,45f,50f);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        weatherData.setMeasurements(99f,54f,30f);
        weatherData.setMeasurements(12f,67f,80f);

    }
}
