package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class atmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);

        ListView listView = (ListView) this.findViewById(R.id.listViews_atm);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.string.street));
        list.add(new DataFlags(R.string.street2));
        list.add(new DataFlags(R.string.street3));
        list.add(new DataFlags(R.string.street3));
        list.add(new DataFlags(R.string.street4));
        list.add(new DataFlags(R.string.street3));
        list.add(new DataFlags(R.string.street2));
        list.add(new DataFlags(R.string.street));


        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}