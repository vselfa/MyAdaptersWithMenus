package com.example.myadapterswithmenus;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class HandmadeLayoutActivity extends MainMenu {

    Functions functions = new Functions();

    private String[] llibres = {"El ninot de neu",
            "Senyoria", "Els assassins de l'emperador"};
    private ListView myBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handmade_layout);

        // The Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.activity_my_book, R.id.bookName, llibres);
        // The View
        myBooks = findViewById(R.id.lstBooks);
        myBooks.setAdapter(adapter);
        // The listener
        myBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String bookName = llibres[position];
                functions.buildDialog ("My books", " Book name: " + bookName, HandmadeLayoutActivity.this);
            }
        });
    }
}