package eu.chrost.java8.weather;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WeatherStationTest {
    @Test
    void shouldReturnTemperatureInFahrenheit() {
        WeatherStation weatherStation = new WeatherStation();
        double temp = weatherStation.getTemperatureInFahrenheit();
        assertThat(temp).isEqualTo(62.0);
    }
}
