package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class currencyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        ListView listView = (ListView) this.findViewById(R.id.listViews_currency);

        ArrayList<dataCur> list = new ArrayList<>();
        list.clear();

        list.add(new dataCur(R.drawable.ru,R.string.RU,R.string.RU_buy,R.string.RU_sell,R.string.RU_name));
        list.add(new dataCur(R.drawable.us,R.string.US,R.string.US_buy,R.string.US_sell,R.string.US_name));
        list.add(new dataCur(R.drawable.jp,R.string.JP,R.string.JP_buy,R.string.JP_sell,R.string.JP_name));


        MyListAdapterCurrency myListAdaptery = new MyListAdapterCurrency(this, list);
        listView.setAdapter(myListAdaptery);
    }
}