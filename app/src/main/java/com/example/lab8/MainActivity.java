package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Declare the variables so that you will be able to reference it later.
    ListView cityList;
    ArrayAdapter<City> cityAdapter;
    ArrayList<City> cityDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);
        cityDataList = new ArrayList<>();



        cityAdapter = new CustomList(this,cityDataList);
        cityList.setAdapter(cityAdapter);

    }




}