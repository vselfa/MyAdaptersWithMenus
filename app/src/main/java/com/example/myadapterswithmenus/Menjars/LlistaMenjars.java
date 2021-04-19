package com.example.myadapterswithmenus.Menjars;

import com.example.myadapterswithmenus.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

// Using a singleton class
// https://www.geeksforgeeks.org/singleton-class-java/

public class LlistaMenjars {

    private static LlistaMenjars llistaMenjars = new LlistaMenjars();
    private HashMap<String, Menjar> menjars = new HashMap<>();

    public static LlistaMenjars getInstance() {
        return llistaMenjars;
    }

    private LlistaMenjars() {
        saveMenjar(new Menjar("Paella marisc", "La típica paella valenciana de marisc", 6, R.drawable.plat_paella_marisc));
        saveMenjar(new Menjar("Fideuà", "Fideuà peix amb fieus fins", 5, R.drawable.plat_fideua));
        saveMenjar(new Menjar("Tortilla de creïlles", "Amb creïlles i sense ceba", 3, R.drawable.plat_tortilla_creilles));
    }

    private void saveMenjar(Menjar menjar) {
        // Creem claus úniques per al hashmap
        String uuid = UUID.randomUUID().toString().replace("-", "");
        menjars.put(uuid, menjar);
    }

    public List<Menjar> getMenjars() {
        return new ArrayList<>(menjars.values());
    }
}