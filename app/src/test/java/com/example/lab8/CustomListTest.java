package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */


    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
         }




     @Test
     public void hasCityTest(){
      list = MockCityList();
      list.addCity(new City("Calgary", "AB"));
      assertThat(list, contains("Calgary", "AB"));
    }


    /**
     *      @Test
     *      public void deleteCityTest(){
     *          list = MockCityList();
     *          int listSize = list.getCount();
     *          list.addCity(new City("Regina", "SK"));
     *          assertEquals(list.getCount(),1);
     *          list.deleteCity(new City("Regina", "SK"));
     *          assertEquals(list.getCount(),0);
     *      }
     */




    /**
     *     @Test
     *     public void countCityTest(){
     *         list = MockCityList();
     *         list.addCity(new City("Red Deer", "AB"));
     *         list.addCity(new City("Lethbridge", "AB"));
     *         list.addCity(new City("Edmonton", "AB"));
     *         int listSize_new = 3;
     *         assertEquals(list.getCount(),listSize_new);
     *
     *     }
     */



}
