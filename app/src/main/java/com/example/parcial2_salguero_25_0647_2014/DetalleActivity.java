package com.example.parcial2_salguero_25_0647_2014;

import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    int itemPosition = -1;
    String itemName = "";
    String itemDetail = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle bn = getIntent().getExtras();

        fragmento_3 dessertDetail = new fragmento_3();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment3, dessertDetail)
                .commit();

        if(bn != null) {
            itemPosition = bn.getInt("itemPosition",0);
            itemName = bn.getString("itemName");
            //itemDetail = Resources.getSystem().getStringArray(R.array.descriptions)[itemPosition];
            bn.putString("itemDetail",itemDetail);
            dessertDetail.setArguments(bn);
            Toast.makeText(getApplicationContext(),"Item "+itemPosition+" es "+itemName+" "+itemDetail,Toast.LENGTH_SHORT).show();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_exit:
                finish();
                moveTaskToBack(true);
                break;
            case R.id.action_datos:
                Toast.makeText(getApplicationContext(),"Diana Marecela Salguero Quezada 25-0647-2014",Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }



}
