package com.example.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomItemsAdapter extends BaseAdapter {
    private Context ctx;
    private int layoutItem;
    private ArrayList<Items> arrayList;

    public CustomItemsAdapter(Context ctx, int layoutItem, ArrayList<Items> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //
        convertView = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        //
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        ImageView imgItem = convertView.findViewById(R.id.itemImage);
        //
        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imgItem.setImageResource(arrayList.get(position).getItemImage());
        return convertView;
    }
}
