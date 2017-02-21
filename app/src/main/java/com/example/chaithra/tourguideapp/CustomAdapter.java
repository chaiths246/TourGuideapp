package com.example.chaithra.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chaithra on 2/17/17.
 */

public class CustomAdapter  extends ArrayAdapter<Design> {

    public CustomAdapter(Context context, ArrayList<Design> deisign) {
        super(context, 0,deisign);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View lisitems=convertView;
        if(lisitems==null)
        {
            lisitems= LayoutInflater.from(getContext()).inflate(R.layout.listitems,parent,false);
        }
        Design currentitem=getItem(position);


        TextView name=(TextView)lisitems.findViewById(R.id.name);
        name.setText(currentitem.getName());
        TextView time=(TextView)lisitems.findViewById(R.id.time);
        time.setText(currentitem.getTime());
        ImageView image=(ImageView)lisitems.findViewById(R.id.image);
        image.setImageResource(currentitem.getImageresourceid());
        return lisitems;
    }




}