package Observer;

public class StatisticsDisplay implements IWeatherDataObserver {

    private float totalTemp ;
    private float totalHum ;
    private float totalPre ;
    private float totalMeasurements = 0 ;

    public void update(float temperature, float humidity, float pressure) {

        totalTemp += temperature;
        totalHum += humidity;
        totalPre+= pressure;
        totalMeasurements++;

        System.out.println(" Statistics:- ");
        System.out.println("Avg Temperature = [" + (totalTemp / totalMeasurements) + "°C]");
        System.out.println("Avg Humidity = [" + (totalHum / totalMeasurements) + "%]");
        System.out.println("Avg Pressure = [" + (totalPre / totalMeasurements) + "hPa]");

    }
}
