package com.example.ikhsanramadhan.myaplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ikhsan ramadhan on 2/19/2018.
 */

public class mahasiswaadapter extends ArrayAdapter<mahasiswa> {
    public mahasiswaadapter(@NonNull Context context,@NonNull List<mahasiswa> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View viewadapter= convertView;
        if (viewadapter==null){
            viewadapter= LayoutInflater.from(getContext()).inflate(R.layout.listview, parent
                    , false);
        }
        mahasiswa mhs= getItem(position);
        ImageView gambar = (ImageView) viewadapter.findViewById(R.id.gambar);
        TextView nim= (TextView) viewadapter.findViewById(R.id.nim);
        TextView nama= (TextView)viewadapter.findViewById(R.id.nama);
        nim.setText(mhs.getNim());
        nama.setText(mhs.getNama());

        switch (position%3){
            case 0:{
                gambar.setImageResource(R.drawable.ic_face_red_48dp);
                break;
            }case 1:{
                gambar.setImageResource(R.drawable.ic_face_green_48dp);
                break;
            }case 2:{
                gambar.setImageResource(R.drawable.ic_face_blue_48dp);
                break;
            }
        }

        return viewadapter;
    }
}
