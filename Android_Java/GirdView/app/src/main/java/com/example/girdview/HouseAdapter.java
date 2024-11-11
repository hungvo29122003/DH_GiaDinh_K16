package com.example.girdview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HouseAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<HouseItem>arrayHouseItem;
    @Override
    public int getCount() {
        return arrayHouseItem.size();
    }

    public HouseAdapter(Context context, int layout, List<HouseItem> arrayHouseItem) {
        this.context = context;
        this.layout = layout;
        this.arrayHouseItem = arrayHouseItem;
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        // tham chiếu
        TextView tvTitle = convertView.findViewById(R.id.tvTitleHouse);
        ImageView imgHouseItem = convertView.findViewById(R.id.imgHouse);
        tvTitle.setText(arrayHouseItem.get(position).getTitle());
        imgHouseItem.setImageResource(arrayHouseItem.get(position).getImg());
        return convertView;
    }
}
