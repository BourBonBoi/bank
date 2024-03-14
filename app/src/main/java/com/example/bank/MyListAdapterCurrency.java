package com.example.bank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapterCurrency extends BaseAdapter {

    private LayoutInflater LInflater;
    private ArrayList<dataCur> list;
    public MyListAdapterCurrency(Context context, ArrayList<dataCur> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public dataCur getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyListAdapterCurrency.ViewHolder holder;
        View v = convertView;

        if ( v == null){
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.listview_currency, parent, false);
            holder.flag = (ImageView) v.findViewById(R.id.flagid);
            holder.name = (TextView) v.findViewById(R.id.name);
            holder.buy = ((TextView) v.findViewById(R.id.buy));
            holder.sell = ((TextView) v.findViewById(R.id.sell));

            v.setTag(holder);
        }

        holder = (MyListAdapterCurrency.ViewHolder) v.getTag();
        dataCur datacur = getData(position);

        holder.flag.setImageResource(datacur.getFlagID());
        holder.name.setText(v.getResources().getString(datacur.getRu_nameID()));
        holder.buy.setText(v.getResources().getString(datacur.getRu_buyID()));
        holder.sell.setText(v.getResources().getString(datacur.getRu_sellID()));

        return v;
    }

    dataCur getData(int position){
        return (getItem(position));
    }
    private static class ViewHolder {
        public TextView name;
        private ImageView flag;
        private TextView buy;
        private TextView sell;
        public TextView info;

    }
}
