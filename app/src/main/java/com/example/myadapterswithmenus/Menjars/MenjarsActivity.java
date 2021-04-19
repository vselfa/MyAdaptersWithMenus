package com.example.myadapterswithmenus.Menjars;

import android.os.Bundle;
import android.util.Log;

import com.example.myadapterswithmenus.MainMenu;
import com.example.myadapterswithmenus.R;

public class MenjarsActivity extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menjars_adapter);

        Log.d ("menjars", "MenjarsActivity");


        MenjarFragment menjarsFragment = (MenjarFragment)
                getSupportFragmentManager().findFragmentById(R.id.menjars_container);

        if (menjarsFragment == null) {
            menjarsFragment = MenjarFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menjars_container, menjarsFragment)
                    .commit();
        }

    }
}

