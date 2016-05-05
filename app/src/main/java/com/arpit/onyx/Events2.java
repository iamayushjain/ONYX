package com.arpit.onyx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arpit on 03/01/2016.
 */
public class Events2 extends Fragment {
    ListView list;
    String[] EventName={"The Flair Of Unorthodoxy","Abhivyakti","Connecting Cartoons","Literathon","Dragon Ballz Hunt", "From Page To Stage","Cartoon Crossword","Naughty Notes","90's And 2000's Cartoon Quiz","DC VS Marvel","Open Mic Poetry","Dexter's Corner"};
    Integer[] img= {R.drawable.ev1,
            R.drawable.ev8,

            R.drawable.ev4,
            R.drawable.ev5,
            R.drawable.ev6,
            R.drawable.ev3,
            R.drawable.ev7,
            R.drawable.ev2,
            R.drawable.ev9,
            R.drawable.ev10,
            R.drawable.ev11,
            R.drawable.ev12};
//    String[] EventName=getResources().getStringArray(R.array.schedule_event_name_day2);
//    String[] EventVenue=getResources().getStringArray(R.array.venue_day2);
//    String[] EventTime=getResources().getStringArray(R.array.time_day2);
    public Events2()
    {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.events2, container,false);
        list= (ListView) rootView.findViewById(R.id.listview_day21);
        eventimagecustom adap= new eventimagecustom(getActivity(),EventName,img);
       list.setAdapter(adap);
//        list.setAdapter(new xyz(getActivity()));


        ClickListener clickListener=new ClickListener();
        list.setOnItemClickListener(clickListener);
        return rootView;
    }

    public class ClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //Jain suno
            //yaha pr har item click hone pr ek tmhari scrolling fragment ayegi
            //uss scrolling fragment mein item position k hisab se data display krna hai
            String info = position+"";//((TextView) arg1).getText().toString();
            Bundle arg=new Bundle();
            arg.putString("User", info);
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa  " + position);
            Intent i=new Intent(getActivity(),MainActivity2.class);
            i.putExtra("User",1+"");
            i.putExtra("User1",info);
            getActivity().startActivity(i);
            //Toast.makeText(c, c.getLocalClassName(), 3000).show();
            getActivity().overridePendingTransition(R.anim.right_slide_in,R.anim.right_slide_out);
        }
    }
}


/*class singlerow{

    String eventName;
    Integer img;

    singlerow(String eventName,Integer img)
    {
        this.eventName=eventName;
        this.img=img;
    }
}

class xyz extends BaseAdapter{
    private final Activity context=null;

    ArrayList <singlerow> list;
    xyz(Activity context){
        list= new ArrayList<singlerow>();
        String[] EventName={"Cartoon CrossWord","Dragon Balls Hunt","Literary Marathon","The Flair Of Unorthodoxy","Bilingual Debate","Cartoon CrossWord","Dragon Balls Hunt","Literary Marathon","The Flair Of Unorthodoxy","Bilingual Debate"};
        Integer[] img= {R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1,R.drawable.img1};

        for(int i=0;i<10;i++)
            list.add(new singlerow(EventName[i],img[i]));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null)
        {LayoutInflater inflater = (LayoutInflater) context.getLayoutInflater();
            convertView= inflater.inflate(R.layout.schedule_custom_row, null, true);
            holder =new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.event_custom_name);
            holder.img= (ImageView) convertView.findViewById(R.id.event_imageView);
            convertView.setTag(holder);

        }
        else
        {
            holder= (ViewHolder) convertView.getTag();
        }
        singlerow temp=list.get(position);
        holder.name.setText(temp.eventName);
        holder.img.setImageResource(temp.img);
        return convertView;
    }
    private class ViewHolder {
        public TextView name;
        public ImageView img;

    }
}*/