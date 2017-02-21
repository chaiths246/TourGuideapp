package com.example.chaithra.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);


        final ArrayList<Design> designs = new ArrayList<Design>();
        designs.add((new Design("Pier39",R.drawable.pier,"Morning 8:Am to 9 pm")));
        CustomAdapter adapter=new CustomAdapter(this,designs);
        ListView listView = (ListView) findViewById(R.id.attractionslist);
        listView.setAdapter(adapter);


    }
}