import Decorator.PrecipitationDecorator;
import Decorator.TemperatureUnitsDecorator;
import Decorator.WindSpeedDecorator;
import Observer.*;

public class App {
    public static void main(String[] args) {

        WeatherData stationA = new WeatherData();

        IWeatherDataObserver currentA = new CurrentConditionsDisplay();
        IWeatherDataObserver statisticsA = new StatisticsDisplay();

        statisticsA  = new PrecipitationDecorator(statisticsA,5);
        currentA  = new TemperatureUnitsDecorator(currentA,true,false);
        currentA  = new WindSpeedDecorator(currentA,12);

        stationA.subscribe(currentA);
        stationA.subscribe(statisticsA);

        stationA.setMeasurements(27f,60f,30f);
        System.out.println("---------------------------------------------------------");


    }


}