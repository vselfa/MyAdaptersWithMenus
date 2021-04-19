package com.example.myadapterswithmenus.Menjars;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myadapterswithmenus.ASimpleAdapterActivity;
import com.example.myadapterswithmenus.R;

public class MenjarFragment extends Fragment {

    ListView mMenjarList;
    MenjarAdapter mMenjarAdapter;

    public MenjarFragment() {
        // Required empty public constructor
        Log.d ("menjars", "MenjarFragment");
    }

    public static MenjarFragment newInstance() {
        MenjarFragment fragment = new MenjarFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) { }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_menjar, container, false);

        Log.d ("menjars", "onCreateView");

        // Instància del ListView.
        mMenjarList = (ListView) root.findViewById(R.id.menjars_list);

        // Inicialitzar adaptador amb les dades
        mMenjarAdapter = new MenjarAdapter(getActivity(), LlistaMenjars.getInstance().getMenjars());
        mMenjarList.setAdapter(mMenjarAdapter);

        // The listener
        // Remember to add android:focusable="false" into the CheckBox!!!
        mMenjarList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Log.d ("menjars", "onclick");
                Menjar currentPlat = mMenjarAdapter.getItem(position);
                Toast.makeText(getActivity(),
                        "Has seleccionat el plat: " + currentPlat.getNom(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

}


