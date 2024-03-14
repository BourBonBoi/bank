package com.example.bank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {

    private LayoutInflater LInflater;
    private ArrayList<DataFlags> list;
    public MyListAdapter(Context context, ArrayList<DataFlags> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataFlags getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        View v = convertView;

        if ( v == null){
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.listview_atm, parent, false);
            holder.name = (TextView) v.findViewById(R.id.name);
            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        DataFlags dataFlags = getData(position);

        holder.name.setText(v.getResources().getString(dataFlags.getNameID()));

        return v;
    }

    DataFlags getData(int position){
        return (getItem(position));
    }
    static class ViewHolder {
        TextView name;
    }
}