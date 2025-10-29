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

    @Test
    void testDelete() {
        CustomList cityList = mockCityList();
        City city1 = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city1);
        City city2 = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city2);
        int length = cityList.getCities().size();
        cityList.deleteCity(city2);
        assertEquals(length-1, cityList.getCities().size());
        assertFalse(cityList.getCities().contains(city2));
    }
}
