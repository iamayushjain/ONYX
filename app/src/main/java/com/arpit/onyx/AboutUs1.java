package com.arpit.onyx;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by arpit on 03/01/2016.
 */
public class AboutUs1 extends Fragment {
    ImageView iv;
    RelativeLayout rl;
    ScrollView sv;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       /* View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }*/
View rootview=inflater.inflate(R.layout.about_us1, container, false);
        iv=(ImageView)rootview.findViewById(R.id.imageView);
        rl=(RelativeLayout)rootview.findViewById(R.id.relativeLayout1);
        sv=(ScrollView)rootview.findViewById(R.id.scrollView12);
        txt= (TextView) rootview.findViewById(R.id.textView7);
        txt.setText("Onyx\n\n"+ "No, not the gemstone. Not the Pokemon either!\n\n" +
                "Onyx stands for the late hours being put up for an unconventional affair;\n\n" +
                "for some odd twenty year olds coming together for the unorthodox dreams of the maverick in us, for our stubbornness for nothing but the very best,\n\n" +
                "for the offbeat tunes that us zanies dance to. It stands for the people who are putting their heart and soul into this fiesta.\n\n" +
                "Onyx stands for its throng of audience, for the people looking forward to live up their childhood again amidst this cartoon fiesta,\n\n" +
                "for the punters and winners of the game. \n\n" +
                "Certainly, it stands for all the literary fanatics, the grammar Nazis, The Lingo freaks.\n\n" +
                "But, more than that, it stands for the vociferous dreamers, the candid ones, the forthright folks.\n\n" +
                "For the voices which refuse to die down. For the pens that won’t stop.\n\n" +
                "Onyx stands for The Galgotias Literary Fest.\n\n" +
                "Avant-garde! See y’ll there!");
        iv.setBackgroundResource(R.drawable.wanim1);
        final AnimationDrawable anim = (AnimationDrawable) iv.getBackground();

        sv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    anim.setVisible(true,true);
               //     Toast.makeText(getActivity(),"f",3000).show();
                    anim.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    anim.stop(); //perform your animation when button is released
                    //animup.setVisible(true,true);
                    //animup.start();
                }
                return false;
            }
        });

        return rootview;
    }
}
