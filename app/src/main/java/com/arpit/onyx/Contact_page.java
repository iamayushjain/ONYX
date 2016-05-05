package com.arpit.onyx;





import java.lang.reflect.Field;


import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;
//import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Contact_page extends Fragment{
	 String[] contacts={"Organiser","Student Organiser","Developer Team"};
	 Integer[] imageId = {
		      R.drawable.cogwheels12,R.drawable.books68,R.drawable.game48
		      };
	 public static Contact_page newInstance() {
			return new Contact_page();
		}
		
	 View view1;
	   
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		view1 = inflater.inflate(R.layout.lingo_freaks, container, false);
  ListView view=(ListView)view1.findViewById(R.id.listView1);
//	       view.setBackgroundColor(Color.BLACK
//	    		   );
//	       view1.setBackgroundColor(Color.BLACK);
////	     lingofreak_imagecustom adapter = new
//				 lingofreak_imagecustom(getActivity(), contacts, imageId);
		eventimagecustom adapter = new
				eventimagecustom(getActivity(), contacts, imageId);

    	/* final imagecustom adapter1 = new
    	        imagecustom(raceingpart.this, contacts3, imageId);
    	*/
		view.setAdapter(adapter);
		//view.setSelector(android.R.color.black);
    	registerForContextMenu(view);
    	view.setOnItemClickListener(clickb);
    	
	return view1;
	}
	OnItemClickListener clickb = new OnItemClickListener() 
	{
	public void onItemClick(android.widget.AdapterView<?> arg0, View arg1, int arg2, long arg3) 
	{
		if(arg2==0)
		{
			int ab=2;
			Intent i=new Intent(getActivity(),MainActivity2.class);
			i.putExtra("User",ab+"");
			i.putExtra("User1", ab + "");
			startActivity(i);
			getActivity().overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);

		}
		else if(arg2==1)
		{
			int ab=3;
			Intent i=new Intent(getActivity(),MainActivity2.class);
			i.putExtra("User",ab+"");
			i.putExtra("User1",ab+"");

			startActivity(i);
			getActivity().overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
			//Toast.makeText(c, c.getLocalClassName(), 3000).show();
		}
		else if(arg2==2)
		{
			int ab=4;
			Intent i=new Intent(getActivity(),MainActivity2.class);
			i.putExtra("User",ab+"");
			i.putExtra("User1",ab+"");

			startActivity(i);
			getActivity().overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
			//Toast.makeText(c, c.getLocalClassName(), 3000).show();
		}

		//Toast.makeText(getApplicationContext(), info, 3000).show();
 	
}
	};

	}
