package com.example.parcial2_salguero_25_0647_2014;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragmento_3 extends Fragment {
    TextView tvDescripcion;
    TextView tvItem;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        int itemPosition = 0;
        String itemDetail = "";
        String itemName = "";
        Bundle bn = getArguments();

        View v = inflater.inflate(R.layout.fragmento_3, container, false);
        tvDescripcion = (TextView) v.findViewById(R.id.tvDescription);
        tvItem = (TextView) v.findViewById(R.id.tvItem);

        if(bn != null) {
            itemDetail = bn.getString("itemDetail");
            itemPosition = bn.getInt("itemPosition", -1);
            itemName = bn.getString("itemName");
            Log.i("**BUNDLE**", "bn not null: "+itemName+" "+itemPosition);
            tvItem.setText("Postre "+(itemPosition+1)+" : "+itemName);
            tvDescripcion.setText(itemDetail);
        } else {
            Log.i("**BUNDLE**", "bn null");
            tvDescripcion.setText("(° - ° \") + oops");
        }
        return v;
    }

}
