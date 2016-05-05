package com.arpit.onyx;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class eventimagecustom extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] titlenameArray;
   // private final String[] titletimeArray;
   // private final String[] titlevenueArray;
//private final String[] web;
 private final Integer[] imageId;

    public eventimagecustom(Activity context, String[] titlenameArray, Integer[] imageId)
    {

        super(context, R.layout.event_custom_row, titlenameArray);

        this.context = context;
        this.titlenameArray = titlenameArray;
        this.imageId= imageId;
//        this.titlevenueArray = titlevenueArray;
//        this.titletimeArray = titletimeArray;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view ==  null) {
            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.event_custom_row, null, true);
            holder= new ViewHolder();
            holder.name = (TextView) view.findViewById(R.id.event_custom_name);
            holder.img= (ImageView) view.findViewById(R.id.event_imageView);

            view.setTag(holder);
        }
        else
        {
            holder= (ViewHolder) view.getTag();
        }

//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

//        TextView venue= (TextView) view.findViewById(R.id.schedule_event_venue);
//        TextView time= (TextView) view.findViewById(R.id.schedule_event_time);

        holder.name.setText(titlenameArray[position]);
//        venue.setText(titlevenueArray[position]);
//        time.setText(titletimeArray[position]);
        holder.img.setImageResource(imageId[position]);
        return view;
    }
    private static class ViewHolder {
        public TextView name;
        public ImageView img;

    }
}

