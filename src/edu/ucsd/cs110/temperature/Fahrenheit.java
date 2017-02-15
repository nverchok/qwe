package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t) {
        super(t);
    }
    public String toString() {
        return getValue() + " F";
    }

    public Temperature toFahrenheit() {
        return this;
    }

    public Temperature toCelsius() {
        return new Fahrenheit((getValue()-32)*5/9);
    }
}

