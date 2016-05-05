package com.arpit.onyx;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class imagecustom5 extends ArrayAdapter<String>{
private final Activity context;
private final String web[];


private final Integer[] imageId;
public imagecustom5(Activity context,
String web[], Integer[] imageId) {
super(context, R.layout.imagelayout6, web);
this.context = context;
this.web = web;

this.imageId = imageId;
}
@Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.imagelayout6, null, true);
//TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
//ImageView imageView = (ImageView) rowView.findViewById(R.id.listImage);
TextView txtTitle=(TextView)rowView.findViewById(R.id.textView1);
//TextView txtTitle1=(TextView)rowView.findViewById(R.id.textView2);
//TextView txtTitle2=(TextView)rowView.findViewById(R.id.textView4);
txtTitle.setText(web[position]);
//txtTitle1.setText(web1[position]);
//txtTitle2.setText("TIME:"+web2[position]);

//imageView.setImageResource(imageId[position]);
return rowView;
}
}

