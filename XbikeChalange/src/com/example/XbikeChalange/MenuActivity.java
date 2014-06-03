package com.example.XbikeChalange;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Emil on 2014-06-03.
 */
public class MenuActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        String[] values = new String[]{"Ride", "cos tam", "cos tam 2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.menuitem_layout, R.id.label, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch (position) {
            case 0:
                Intent ride = new Intent(this, RideActivity.class);
                startActivity(ride);
                break;
            case 1:
                Toast.makeText(getApplicationContext(),"Czas nie nadszedł jeszcze",Toast.LENGTH_LONG).show();
                break;

        }
    }
}