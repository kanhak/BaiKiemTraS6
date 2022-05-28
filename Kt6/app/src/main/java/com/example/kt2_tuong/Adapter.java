package com.example.kt2_tuong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapter  extends ArrayAdapter<QuocGia> {
    Context context;
    int res;
    ArrayList<QuocGia> quocGiaArrayList;
    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList<QuocGia> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.quocGiaArrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        ImageView imageView = convertView.findViewById(R.id.img);
        TextView ten = convertView.findViewById(R.id.ten);
        TextView so = convertView.findViewById(R.id.so);
        QuocGia quocGia =quocGiaArrayList.get(position);

        imageView.setImageResource(quocGia.getHinh());
        ten.setText(quocGia.getTen());
        so.setText(quocGia.getSo())
        ;

        return convertView;
    }
}
