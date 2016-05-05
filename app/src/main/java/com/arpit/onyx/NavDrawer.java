package com.arpit.onyx;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavDrawer extends Fragment {

//    private RecyclerView recyclerView;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private boolean mUserLearnedDrawer;  // learns whether user is aware of drawer or not(means drawer should start when first time activity start)
    private boolean mFromSaveInstanceState; // indicate whether fragment is coming first time or coming from rotation
    private View containerView;
    public  static final String pref_file_name= "testpref";
    public  static final String key_user_learned_drawer ="user_learned_drawer";
    private ImageButton FB, Twitter, Web;
    Layout layout;

    public NavDrawer() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnedDrawer= Boolean.valueOf(readFromPreferences(getActivity(),key_user_learned_drawer,"false"));
        if(savedInstanceState!=null)
            mFromSaveInstanceState=true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout=inflater.inflate(R.layout.fragment_nav_drawer, container, false);
       // FB= (ImageButton) layout.findViewById(R.id.fb);
       // Twitter= (ImageButton) layout.findViewById(R.id.twitter);
       // Web= (ImageButton) layout.findViewById(R.id.web);

       /* FB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Onyx-Galgotias-Literary-Fiesta-1675467542737659"));
                startActivity(i);
            }
        });

        /*Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/onyxgcet"));
                startActivity(i);
            }
        });

        Web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.onyxgcet.com/"));
                startActivity(i);
            }
        });*/

           /* layout=getActivity().findViewById(R.id.nav_drawer_layout);
            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(layout.getWindowToken(), 0);
           */


        return layout;
    }


    public void setUp( int fragmentID, DrawerLayout dl, Toolbar tb) {
        mDrawerLayout=dl;
        containerView=getActivity().findViewById(fragmentID);
        mDrawerToggle=new ActionBarDrawerToggle(getActivity(),dl,tb,R.string.navigation_drawer_open,R.string.navigation_drawer_close){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(mDrawerLayout.getWindowToken(), 0);
                if(!mUserLearnedDrawer)
                {
                    mUserLearnedDrawer=true;
                    saveToPreferences(getActivity(),key_user_learned_drawer,mUserLearnedDrawer+"");
                }
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                getActivity().invalidateOptionsMenu();


            }
        };
        if(!mUserLearnedDrawer && !mFromSaveInstanceState){

            mDrawerLayout.openDrawer(containerView);
        }

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }

    public static void saveToPreferences(Context context, String preferenceName, String preferenceValue) {
        SharedPreferences sharedPreferences=context.getSharedPreferences(pref_file_name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString(preferenceName,preferenceValue);
        editor.apply();

    }
    public static String readFromPreferences(Context context, String preferenceName, String defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(pref_file_name, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName,defaultValue);
    }
}
