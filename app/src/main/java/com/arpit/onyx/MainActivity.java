package com.arpit.onyx;

import android.content.Context;
import android.graphics.Point;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    DrawerLayout mDrawerLayout;
    ViewPager viewPager;
    ListView listView;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar= (Toolbar) findViewById(R.id.appbar);
        listView=(ListView) findViewById(R.id.drawerlist);
//        Display display=getWindowManager().getDefaultDisplay();
//        Point size= new Point();
//        display.getSize(size);
//        int width= size.x;
//        width/=2;
//        Toast.makeText(this,width+ " ",Toast.LENGTH_LONG).show();
//        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) mDrawerLayout.getLayoutParams();
       // DrawerLayout.LayoutParams params = (android.support.v4.widget.DrawerLayout.LayoutParams) mDrawerLayout.getLayoutParams();
       // params.width=width;
       // mDrawerLayout.setLayoutParams(params);
        String[] menu=getResources().getStringArray(R.array.menu);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                viewPager.setCurrentItem(position);
                mDrawerLayout.closeDrawers();

            }
        });
        listView.setAdapter(new ArrayAdapter<>(this, R.layout.menu_custom_row, menu));


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

       // NavDrawer drawFrag= new NavDrawer(); //Creating Object of Drawer (2nd child)
        NavDrawer drawFrag= (NavDrawer) getFragmentManager().findFragmentById(R.id.navdrawer); //linking it to mainactivity.xml fragment

        drawFrag.setUp(R.id.navdrawer, (DrawerLayout) findViewById(R.id.drawer_layout),toolbar);//calling a method with parameters

        viewPager= (ViewPager) findViewById(R.id.pager);
        MyAdapter myadap= new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myadap);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {




                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    //Toast.makeText(this,"zzzzzzzzzzzzzzzzzzzzzz",Toast.LENGTH_LONG).show();
                    imm.hideSoftInputFromWindow(viewPager.getWindowToken(), 0);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        viewPager.setCurrentItem(position);
    }
}

class MyAdapter extends FragmentStatePagerAdapter {


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;
        if(position == 0)
            frag= new AboutUs1();
        if(position == 1)
            frag= new Events2();
        if(position == 2)
            frag= new Schedule3();
        if(position == 3)
            frag= new Registration5();
        if(position == 4)
            frag = new Contact_page();

//        frag.getView().setRotation(-90f);
        return frag;
    }

    @Override
    public int getCount() {
        return 5;
    }
}