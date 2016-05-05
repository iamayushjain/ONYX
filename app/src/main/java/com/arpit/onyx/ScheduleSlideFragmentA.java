package com.arpit.onyx;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by arpit on 11/01/2016.
 */
public class ScheduleSlideFragmentA extends Fragment {

    ListView list;
    String[] EventName={"Opening Ceremony", "Book Launch & Q/A Session", "DC Vs Marvel", "Literathon", "Connecting Cartoons", "Dragon Ballz Hunt (Round 1)", "Cartoon Crossword", "Naughty Notes"};
    String[] EventVenue={"Auditorium", "Auditorium", "Seminar Hall", "Ground", "C-104", "Ground", "Block C Arena", "C-104"};
    String[] EventTime={"9:30- 10:30", "10:30-11:30", "11:00-13:00", "12:00-14:00", "12:00-13:30", "12:45-17:00", "12:50-13:30", "15:00-16:00"};

    @Nullable
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*EventName=getResources().getStringArray(R.array.schedule_event_name_day1);
        EventVenue=getResources().getStringArray(R.array.venue_day1);
        EventTime=getResources().getStringArray(R.array.time_day1);*/

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.list_view_layout, container, false);
        // Using the layout of ScheduleSlideFragmentB to call a list and calling imagecustom row in an adapter
        // then putting above values in adapter
        list= (ListView) rootView.findViewById(R.id.listview_day2);
        imagecustom adap= new imagecustom(getActivity(),EventName,EventVenue,EventTime);
        list.setAdapter(adap);

        return rootView;
    }
}
