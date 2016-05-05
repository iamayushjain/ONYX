package com.arpit.onyx;





//import android.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class Contact_page_devel extends Fragment{
	 public static Contact_page_devel newInstance() {
			return new Contact_page_devel();
		}
		
	 View view1;
	ImageButton b1,b2,b3,b4;
	TextView t1,t2,t3,t4;

	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		view1 = inflater.inflate(R.layout.developerlayout, container, false);
		view1.setBackgroundColor(Color.BLACK);
		b1=(ImageButton) view1.findViewById(R.id.imageButton1);
		b2=(ImageButton) view1.findViewById(R.id.imageButton2);
		b3=(ImageButton) view1.findViewById(R.id.imageButton3);
		b4=(ImageButton) view1.findViewById(R.id.imageButton4);
		t1=(TextView)view1.findViewById(R.id.textView2);
		t2=(TextView)view1.findViewById(R.id.textView4);
		t3=(TextView)view1.findViewById(R.id.textView6);
		t4=(TextView)view1.findViewById(R.id.textView8);
		//t1.setVisibility(View.GONE);
		t2.setVisibility(View.GONE);
		t3.setVisibility(View.GONE);
		t4.setVisibility(View.GONE);
		//b1.setVisibility(View.GONE);
		b2.setVisibility(View.GONE);
		b3.setVisibility(View.GONE);
		b4.setVisibility(View.GONE);
		b1.setBackgroundColor(Color.TRANSPARENT);
		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mydata2 = "tel:" + "9532511310";
				Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
				startActivity(myActivity2);

			}
		});
		t1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mydata2 = "tel:" + "9532511310";
				Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
				startActivity(myActivity2);

			}
		});
		return view1;
	}
}