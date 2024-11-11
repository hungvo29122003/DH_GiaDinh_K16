package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<SinhVien>arraySinhVien;
    @Override
    public int getCount() {
        return arraySinhVien.size();
    }

    public SinhVienAdapter(Context context, int layout, List<SinhVien> arraySinhVien) {
        this.context = context;
        this.layout = layout;
        this.arraySinhVien = arraySinhVien;
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

        //tham chieu 2 textview
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvTuoi = convertView.findViewById(R.id.tvTuoi);
        tvName.setText(arraySinhVien.get(position).name);
        tvTuoi.setText(String.valueOf(arraySinhVien.get(position).tuoi));
        return convertView;
    }
}
