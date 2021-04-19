package com.example.myadapterswithmenus.Menjars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myadapterswithmenus.Menjars.Menjar;
import com.example.myadapterswithmenus.R;

import java.util.List;

public class MenjarAdapter extends ArrayAdapter<Menjar> {

    public MenjarAdapter(Context context, List<Menjar> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener inflater.
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // ¿Existe el view actual?
        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.menjar_item,
                    parent,
                    false);
        }

        // Referencias UI.
        ImageView avatar = (ImageView) convertView.findViewById(R.id.menjar_avatar);
        TextView nom = (TextView) convertView.findViewById(R.id.menjar_nom);
        TextView descripcio = (TextView) convertView.findViewById(R.id.menjar_descripcio);
        TextView preu = (TextView) convertView.findViewById(R.id.menjar_preu);

        // Lead actual.
        Menjar menjar = getItem(position);

        // Setup.
        Glide.with(getContext()).load(menjar.getFoto()).into(avatar);
        nom.setText(menjar.getNom());
        descripcio.setText(menjar.getDescripcio());
        preu.setText("Preu: " + String.valueOf(menjar.getPreu()) + " €");

        return convertView;
    }
}

