package com.example.myadapterswithmenus;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SimplestAdapterActivity extends MainMenu {

    // Data Source
    private String[] llibres =
            {"El ninot de neu", "Senyoria", "Els assassins de l'emperador"};
    // The View object
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplest_adapter);

        // The Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, llibres);
        // The View
        myListView = findViewById (R.id.lstOptions);
        myListView.setAdapter(adapter);

        // To let select / unselect checkboxes
        myListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("SimplestAdapterActivity", "onItemClick: " + position);
                CheckedTextView v = (CheckedTextView) view;
                boolean currentCheck = v.isChecked();
            }
        });
    }
}