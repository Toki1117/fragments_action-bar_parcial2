package com.example.parcial2_salguero_25_0647_2014;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class fragmento_2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

        View v = inflater.inflate(R.layout.fragmento_2, container, false);
        final ListView lvPostres = (ListView) v.findViewById(R.id.lvItems);

        lvPostres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(requireContext(), lvPostres.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(requireContext(),DetalleActivity.class);
                intent.putExtra("itemPosition",position);
                intent.putExtra("itemName",lvPostres.getItemAtPosition(position).toString());

                startActivity(intent);
            }
        });

        return v;
    }

}
