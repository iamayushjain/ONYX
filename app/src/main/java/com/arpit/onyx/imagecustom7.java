package com.arpit.onyx;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

public class imagecustom7 extends ArrayAdapter<String>{
private final Activity context;
private final String[] web;
private final String[] web1;

public imagecustom7(Activity context,
String[] web,String[] web1) {
super(context, R.layout.imagecustom7, web);
this.context = context;
this.web = web;
this.web1 = web1;

}
@Override
public View getView(final int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagecustom7, null, true);
//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
ImageButton imageView = (ImageButton) rowView.findViewById(R.id.imageButton1);
TextView txtTitle=(TextView)rowView.findViewById(R.id.textView1);
TextView txtTitle1=(TextView)rowView.findViewById(R.id.textView2);
//TextView txtTitle2=(TextView)rowView.findViewById(R.id.textView4);
txtTitle.setText(web[position]);
txtTitle1.setText(web1[position]);
imageView.setBackgroundColor(Color.TRANSPARENT);
imageView.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//String myData= text1.getText().toString();
		String mydata2="tel:"+ web1[position];
		Intent myActivity2 = new Intent(Intent.ACTION_DIAL, Uri.parse(mydata2));
		context.startActivity(myActivity2);
	
	}
});
//txtTitle2.setText("TIME:"+web2[position]);

//imageView.setImageResource(imageId[0]);
return rowView;
}
}

