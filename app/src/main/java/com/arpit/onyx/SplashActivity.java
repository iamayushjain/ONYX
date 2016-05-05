package com.arpit.onyx;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import io.saeid.fabloading.LoadingView;

public class SplashActivity extends AppCompatActivity {

    private LoadingView mLoadingView;
    MyCount counter = new MyCount(1000,100);
    int i=0;
    LinearLayout ll;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_activity);
        mLoadingView = (LoadingView) findViewById(R.id.loading_view_repeat);
        ll=(LinearLayout)findViewById(R.id.linearlay);
        boolean isLollipop = Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP;
        int marvel_1 = isLollipop ? R.drawable.marvel_1_lollipop : R.drawable.marvel_1;
        int marvel_2 = isLollipop?R.drawable.marvel_2_lollipop : R.drawable.marvel_2;
        int marvel_3 = isLollipop ? R.drawable.marvel_3_lollipop :R.drawable.marvel_3;
        int marvel_4 = isLollipop?R.drawable.marvel_4_lollipop:R.drawable.marvel_4;
        mLoadingView.addAnimation(Color.parseColor("#FFD200"),marvel_1,
                LoadingView.FROM_LEFT);
        mLoadingView.addAnimation(Color.parseColor("#2F5DA9"), marvel_2,
                LoadingView.FROM_TOP);
        mLoadingView.addAnimation(Color.parseColor("#FF4218"),marvel_3,
                LoadingView.FROM_RIGHT);
        mLoadingView.addAnimation(Color.parseColor("#C7E7FB"), marvel_4,
                LoadingView.FROM_BOTTOM);

        mLoadingView.addListener(new LoadingView.LoadingListener() {
            @Override
            public void onAnimationStart(int currentItemPosition) {

            }

            @Override
            public void onAnimationRepeat(int nextItemPosition) {

            }

            @Override
            public void onAnimationEnd(int nextItemPosition) {

            }
        });
        ll.setBackgroundColor(Color.parseColor("#80FFD200"));

        counter.start();

//        Thread background = new Thread() {
//            public void run() {
//
//                try {
//                    // Thread will sleep for 5 seconds
//                    sleep(5*1000);
//
//                    // After 5 seconds redirect to another intent
//                    Intent i=new Intent(getBaseContext(),Main2Activity.class);
//                    startActivity(i);
//
//                    //Remove activity
//                    finish();
//
//                } catch (Exception e) {
//
//                }
//            }
//        };
//
//        // start thread
//        background.start();
    }
    public class MyCount extends CountDownTimer{

        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);

        }
        public void onTick(long millisUntilFinished) {
        }
        public void onFinish() {
            if(i!=5) {
                switch (i) {
                    case 0:
                        ll.setBackgroundColor(Color.parseColor("#802F5DA9"));
                        break;
                    case 1:
                        ll.setBackgroundColor(Color.parseColor("#80FF4218"));
                        break;
                    case 2:
                        ll.setBackgroundColor(Color.parseColor("#80C7E7FB"));
                        break;
                    case 3:
                        ll.setBackgroundColor(Color.parseColor("#80FFD200"));
                        break;
                    case 4:
                        ll.setBackgroundColor(Color.parseColor("#802F5DA9"));
                        break;

                }
                if (i <= 5) {
                    mLoadingView.startAnimation();
                    i++;
                    counter.start();
                }
            }
                else {

                    Intent i1=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i1);
                    counter.cancel();
                    i=0;

                    overridePendingTransition(R.anim.from_middle,R.anim.in_middle);
                    finish();
                }

        }
    }

    @Override protected void onResume() {
        super.onResume();
    }

    public void pause(View v) {
        mLoadingView.pauseAnimation();
        //  mLoadViewLong.pauseAnimation();
        //mLoadViewNoRepeat.pauseAnimation();
    }

    public void start(View v) {

    }

    public void resume(View v) {
        mLoadingView.resumeAnimation();
        // mLoadViewLong.resumeAnimation();
        //   mLoadViewNoRepeat.resumeAnimation();
    }
}