package com.arpit.onyx;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class imagecustom extends ArrayAdapter<String>{
private final Activity context;
private final String[] titlenameArray;
private final String[] titletimeArray;
private final String[] titlevenueArray;
//private final String[] web;
//private final Integer[] imageId;

    public imagecustom(Activity context, String[] titlenameArray, String[] titlevenueArray,String[] titletimeArray)
    {

        super(context, R.layout.schedule_custom_row, titlenameArray);
 //       Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "fonts/cool_jazz.ttf");
        this.context = context;
        this.titlenameArray = titlenameArray;
        this.titlevenueArray = titlevenueArray;
        this.titletimeArray = titletimeArray;
    }

@Override
public View getView(int position, View view, ViewGroup parent) {

    ViewHolder holder;

       if(view == null)
       {LayoutInflater inflater = context.getLayoutInflater();
        view= inflater.inflate(R.layout.schedule_custom_row, null, true);
     //      Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "fonts/cool_jazz.ttf");

           holder =new ViewHolder();
           holder.name = (TextView) view.findViewById(R.id.schedule_event_name);
      //     holder.name.setTypeface(custom_font);
           holder.venue= (TextView) view.findViewById(R.id.schedule_event_venue);
           holder.time= (TextView) view.findViewById(R.id.schedule_event_time);
           view.setTag(holder);

       }
    else
       {
           holder= (ViewHolder) view.getTag();
       }

//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        holder.name.setText(titlenameArray[position]);
//        Typeface custom_font = Typeface.createFromAsset(context.getAssets(),  "fonts/cool_jazz.ttf");
//        name.setTypeface(custom_font);
        holder.venue.setText(titlevenueArray[position]);
        holder.time.setText(titletimeArray[position]);

//imageView.setImageResource(imageId[position]);
return view;
}

    private static class ViewHolder {
        public TextView name,venue,time;

    }
}

