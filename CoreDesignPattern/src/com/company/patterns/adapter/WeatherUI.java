package com.company.patterns.adapter;

public class WeatherUI {

    public void showTemperature(int zipCode){
       WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(zipCode));
    }

    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(225415);
    }
}
