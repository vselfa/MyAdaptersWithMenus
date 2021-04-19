package com.example.myadapterswithmenus;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myadapterswithmenus.Menjars.MenjarsActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (id == R.id.SimplestActivity) {
            Intent intent = new Intent(this, SimplestAdapterActivity.class);
            startActivity(intent);
        }
        if (id == R.id.HandmadeActivity) {
            Intent intent = new Intent(this, HandmadeLayoutActivity.class);
            startActivity(intent);
        }
        if (id == R.id.SimpleAdapterActivity) {
            Intent intent = new Intent(this, ASimpleAdapterActivity.class);
            startActivity(intent);
        }
        if (id == R.id.MenjarsAdapterActivity) {
            Intent intent = new Intent(this, MenjarsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
