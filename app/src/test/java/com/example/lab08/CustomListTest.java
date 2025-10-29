package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
        return cityList;
    }
    private City mockCity() {

        return new City("Edmonton", "Alberta");
    }

    @Test
    void HasCityTest() {
        CustomList cityList = mockCityList();
        City city = cityList.getCities().get(0);
        assertTrue(cityList.hasCity(city));
        City city1 = new City("Yellowknife", "Northwest Territories");
        assertFalse(cityList.hasCity(city1));
    }
}
