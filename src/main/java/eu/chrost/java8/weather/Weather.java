package eu.chrost.java8.weather;

public interface Weather {
    double getTemperatureInCelsius();

    default double getTemperatureInFahrenheit() {
        return toFahrenheit(getTemperatureInCelsius());
    }

    static double toFahrenheit(double celsius) {
        return celsius + 32.0;
    }
}
