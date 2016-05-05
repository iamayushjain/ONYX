package com.arpit.onyx;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;

/**
 * Created by arpit on 03/01/2016.
 */
public class Schedule3 extends Fragment {
    private static int NUM_PAGES = 2;
    ViewPager viewPager;
    private PagerAdapter mPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.schedule3, container, false);
        viewPager= (ViewPager) rootView.findViewById(R.id.schedulepager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        viewPager
                .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int pos) {

                    }
                });

        return rootView;
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
            Fragment frag = null;
            if (position ==0)
                frag= new ScheduleSlideFragmentA();

            else
                frag = new ScheduleSlideFragmentB();

            return frag ;
        }
        @Override
        public int getCount() {
            return NUM_PAGES;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return "DAY " + (position + 1);
        }
    }
    /*public static class ScheduleSlideFragmentB1 extends Fragment {
        ListView list;
        String[] EventName=getResources().getStringArray(R.array.schedule_event_name_day2);
        String[] EventVenue=getResources().getStringArray(R.array.venue_day2);
        String[] EventTime=getResources().getStringArray(R.array.time_day2);



        public ScheduleSlideFragmentB1() {

        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView=inflater.inflate(R.layout.list_view_layout, container, false);
            System.out.println("Ayush");
            list= (ListView) rootView.findViewById(R.id.listview_day2);
            imagecustom adap= new imagecustom(getActivity(),EventName,EventVenue,EventTime);
            list.setAdapter(adap);

            return rootView;
        }
    }*/


}
