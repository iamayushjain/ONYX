package com.arpit.onyx;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by arpit on 11/01/2016.
 */
public class ScheduleSlideFragmentB extends Fragment {
    ListView list;
    String[] EventName={"Cartoon Quiz", "Abhivyakti", "Dragon Ballz Hunt (Round 2)", "From Page to Stage", "Dexter's Corner", "Open Mic Poetry", "Closing Ceremony"};
    String[] EventVenue={"C-104", "Seminar Hall", "Ground", "Auditorium", "Auditorium", "Seminar Hall", "Auditorium"};
    String[] EventTime={"11:00-13:00", "11:00-13:00", "12:00-16:00", "12:00-14:00", "14:30-15:30", "14:30-15:30", "16:00-17:00"};

//   String[] EventName=getActivity().getResources().getStringArray(R.array.schedule_event_name_day2);
//    String[] EventVenue=getActivity().getResources().getStringArray(R.array.venue_day2);

// /    String[] EventTime=getActivity().getResources().getStringArray(R.array.time_day2);

    public ScheduleSlideFragmentB() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.list_view_layout, container, false);
        list= (ListView) rootView.findViewById(R.id.listview_day2);
        imagecustom adap= new imagecustom(getActivity(),EventName,EventVenue,EventTime);
        list.setAdapter(adap);

     return rootView;
    }
}

