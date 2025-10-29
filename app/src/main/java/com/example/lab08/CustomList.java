package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }

    public Boolean hasCity(City city) {

        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    // add comment
    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
