package com.arpit.onyx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

  //  DrawerLayout mDrawerLayout;
   // ViewPager viewPager;
    ListView listView;
    private Toolbar toolbar;
    String s,s1;
    int navi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bund = getIntent().getExtras();
        s = "" + bund.getString("User");
        s1 = "" + bund.getString("User1");
        int new_position = Integer.parseInt(s);
        int new_position1 = Integer.parseInt(s1);
        // Description_page frag=new Description_page();
        switch (new_position) {


            case 1:
                Bundle args = new Bundle();

                args.putString("User", s1);
                Description_page frag = new Description_page();
                frag.setArguments(args);
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, frag).commit();
                break;
            case 2:
                Contact_page_Fact_dev frag1 = new Contact_page_Fact_dev();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, frag1).commit();
                break;
            case 3:
                Contact_page_Fact_Stu frag2 = new Contact_page_Fact_Stu();

                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, frag2).commit();
                break;
            case 4:
                Contact_page_devel frag3 = new Contact_page_devel();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, frag3).commit();
                break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
//        startActivityForResult(myIntent, 0);finish();
        finish();
        overridePendingTransition(R.anim.right_slide_in2, R.anim.right_slide_out2);


        return true;

    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.right_slide_in2, R.anim.right_slide_out2);
    }
}

