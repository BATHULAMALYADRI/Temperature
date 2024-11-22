package com.lbrce.temp;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Predefined temperatures
        double celsius = 25.0;
        double fahrenheit = 77.0;

        // Conversion from Celsius to Fahrenheit
        double convertedToFahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f°C is %.2f°F%n", celsius, convertedToFahrenheit);

        // Conversion from Fahrenheit to Celsius
        double convertedToCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2f°F is %.2f°C%n", fahrenheit, convertedToCelsius);
    }
}
