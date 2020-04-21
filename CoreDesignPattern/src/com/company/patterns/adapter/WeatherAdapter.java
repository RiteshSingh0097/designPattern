package com.company.patterns.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipCode) {
        String city = null;
        if (zipCode == 225415) {
            city = "Land of Rajput";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        int temp = finder.find(city);
        return temp;
    }
}
