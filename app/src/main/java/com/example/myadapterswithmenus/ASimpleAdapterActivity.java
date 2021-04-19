package com.example.myadapterswithmenus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASimpleAdapterActivity extends MainMenu {

    Functions functions = new Functions();

    private String[] names =
            {"Jaume Cabré", "John Grisman", "Santiago Posteguillo"};
    private int[] photosWriters =
            {R.drawable.jaume_cabre, R.drawable.john_grisham, R.drawable.santiago_posteguillo};
    private ListView myWriters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_simple_adapter);

        // Creating an array <Name writer, Photo writer>
        List<Map<String ,Object>> data = new ArrayList<Map<String , Object>>();
        for (int i = 0; i < 3; i++) {
            Map<String ,Object> datum = new HashMap<String ,Object>();
            datum.put("photo", photosWriters[i]);
            datum.put("name", names[i]);
            data.add(datum);
        }
        myWriters = findViewById(R.id.lstWriters);

        // The SimpleAdapter class
        SimpleAdapter simpleAdapter =
                new SimpleAdapter(
                        this,
                        data,
                        R.layout.activity_my_writer,
                        new String[] {"photo","name"},
                        new int[] {R.id.writerPhoto, R.id.writerName}
                );
        myWriters.setAdapter(simpleAdapter);

        // The listener
        myWriters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String writerName = names[position];
                functions.buildDialog ("My writers", " Writer name: " + writerName, ASimpleAdapterActivity.this);
            }
        });

    }
}