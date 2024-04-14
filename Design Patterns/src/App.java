import Decorator.PrecipitationDecorator;
import Decorator.TemperatureUnitsDecorator;
import Decorator.WindSpeedDecorator;
import Observer.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println();
        orderFun();
    }

    private static void orderFun() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Add Temperature :- ");
        float temperature = myObj.nextFloat();
        System.out.println("Add Humidity :- ");
        float humidity = myObj.nextFloat();
        System.out.println("Add Pressure :- ");
        float pressure = myObj.nextFloat();


        WeatherData stationA = new WeatherData();
        IWeatherDataObserver currentA = new CurrentConditionsDisplay();
        IWeatherDataObserver statisticsA = new StatisticsDisplay();


        System.out.println("Add The Values To Be Displayed from the following :-");
        System.out.println("[ (c to f) || (f to c) || (wind) || (pre) || (done) ]");
        System.out.println();
        label:
        while (true) {
            String additions = myObj.nextLine();
            System.out.println("Add Here");
            switch (additions) {
                case "c to f":
                    currentA = new TemperatureUnitsDecorator(currentA, true, false);
                    break;
                case "f to c":
                    currentA = new TemperatureUnitsDecorator(currentA, false, true);
                    break;
                case "wind":
                    System.out.println("Add Wind Speed :- ");
                    float wind = myObj.nextFloat();
                    currentA = new WindSpeedDecorator(currentA, wind);
                    break;
                case "pre":
                    System.out.println("Add Precipitation :- ");
                    float pre = myObj.nextFloat();
                    statisticsA = new PrecipitationDecorator(statisticsA, pre);
                    break;
                case "done":
                    stationA.subscribe(currentA);
                    stationA.subscribe(statisticsA);
                    stationA.setMeasurements(temperature,humidity,pressure);
                    break label;
            }

        }



    }

}