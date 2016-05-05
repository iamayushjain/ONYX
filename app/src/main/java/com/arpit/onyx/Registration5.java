package com.arpit.onyx;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by SONY on 19-01-2016.
 */
public class Registration5 extends Fragment {

    public static final MediaType FORM_DATA_TYPE
            = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    //URL derived from form URL
    public static final String URL="https://docs.google.com/forms/d/17E4CySpZNug7ABLOfKc3g-Qvh0J2sQrc_H2s-lsDbiY/formResponse";
    //input element ids found from the live form page

    public static final String FULL_NAME_KEY ="entry_1555723875";
    public static final String COLLEGE_KEY="entry_387018911"; //entry_1623137903 //q5- entry_712946189 // q4 (list)- entry_627826873
    public static final String EMAIL_KEY="entry_1623137903";
    public static final String PHONE_kEY="entry_627826873";
    public static final String EVENT_KEY="entry_712946189";

    private Context context;

    private EditText fullnameEdittext;
    private EditText collegeEdittext;
    private EditText emailEditText;
    private EditText phoneEditText;
    private CheckBox chkbox1,chkbox2,chkbox3,chkbox4,chkbox5,chkbox6, chkbox7,chkbox8,chkbox9,chkbox10,chkbox11,chkbox12;
    private String all_event;
    public boolean mResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.registration5, container, false);
        //save the activity in a context variable to be used afterwards
        context = getActivity();

        //Get references to UI elements in the layout
        Button sendButton = (Button) rootview.findViewById(R.id.register_button);

        fullnameEdittext = (EditText) rootview.findViewById(R.id.register_name);
        collegeEdittext = (EditText) rootview.findViewById(R.id.register_college_name);
        emailEditText = (EditText) rootview.findViewById(R.id.register_email);
        phoneEditText= (EditText) rootview.findViewById(R.id.register_phone);
        chkbox1= (CheckBox) rootview.findViewById(R.id.checkBox);
        chkbox2= (CheckBox) rootview.findViewById(R.id.checkBox2);
        chkbox3= (CheckBox) rootview.findViewById(R.id.checkBox3);
        chkbox4= (CheckBox) rootview.findViewById(R.id.checkBox4);
        chkbox5= (CheckBox) rootview.findViewById(R.id.checkBox5);
        chkbox6= (CheckBox) rootview.findViewById(R.id.checkBox6);
        chkbox7= (CheckBox) rootview.findViewById(R.id.checkBox7);
        chkbox8= (CheckBox) rootview.findViewById(R.id.checkBox8);
        chkbox9= (CheckBox) rootview.findViewById(R.id.checkBox9);
        chkbox10= (CheckBox) rootview.findViewById(R.id.checkBox10);
        chkbox11= (CheckBox) rootview.findViewById(R.id.checkBox11);
        chkbox12= (CheckBox) rootview.findViewById(R.id.checkBox12);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Make sure all the fields are filled with values
                if (TextUtils.isEmpty(emailEditText.getText().toString()) ||
                        TextUtils.isEmpty(fullnameEdittext.getText().toString()) ||
                        TextUtils.isEmpty(collegeEdittext.getText().toString()) ||
                        TextUtils.isEmpty(phoneEditText.getText().toString())) {

                    Toast.makeText(context, "All fields are mandatory.", Toast.LENGTH_LONG).show();
                    return;
                }

                //Check if a valid email is entered
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailEditText.getText().toString()).matches()) {
                    Toast.makeText(context, "Please enter a valid email.", Toast.LENGTH_LONG).show();
                    return;
                }

                if (phoneEditText.getText().length()>10 || phoneEditText.getText().length()<1){
                    Toast.makeText(context, "Please enter 10 digit number.", Toast.LENGTH_LONG).show();
                    return;

                }

                all_event=checkButton();
//                if(chkbox1.isChecked()){
//                    //event= chkbox1.getText().toString();
//                    //event.append(String.valueOf(chkbox1));
//                    event.append(chkbox1.getText().toString());
//                    System.out.println(event);
//                }
//                if(chkbox2.isChecked()){
//                    //event= chkbox1.getText().toString();
//                    //event.append(String.valueOf(chkbox1));
//                    event.append(chkbox2.getText().toString());
//                    System.out.println(event);
//                }




                //Create an object for PostDataTask AsyncTask
                PostDataTask postDataTask = new PostDataTask();

                //execute asynctask
                postDataTask.execute(URL, fullnameEdittext.getText().toString(),
                        collegeEdittext.getText().toString(), emailEditText.getText().toString(),
                        phoneEditText.getText().toString(), all_event /*event.toString()*/);



            }
        });
        return rootview;
    }

    public String checkButton()
    {
        ArrayList<String> event= new ArrayList<String>();
//        StringBuffer event=new StringBuffer();
        if(chkbox1.isChecked()){
            //event= chkbox1.getText().toString();
            //event.append(String.valueOf(chkbox1));
            event.add(chkbox1.getText().toString());
            //  System.out.println(event);
        }
        else
        {
            event.remove(chkbox1.getText().toString());
        }

        if(chkbox2.isChecked())
            event.add(chkbox2.getText().toString());

        else
            event.remove(chkbox2.getText().toString());

        if(chkbox3.isChecked())
            event.add(chkbox3.getText().toString());

        else
            event.remove(chkbox3.getText().toString());

        if(chkbox4.isChecked())
            event.add(chkbox4.getText().toString());

        else
            event.remove(chkbox4.getText().toString());

        if(chkbox5.isChecked())
            event.add(chkbox5.getText().toString());

        else
            event.remove(chkbox5.getText().toString());

        if(chkbox6.isChecked())
            event.add(chkbox6.getText().toString());

        else
            event.remove(chkbox6.getText().toString());

        if(chkbox7.isChecked())
            event.add(chkbox7.getText().toString());

        else
            event.remove(chkbox7.getText().toString());

        if(chkbox8.isChecked())
            event.add(chkbox8.getText().toString());

        else
            event.remove(chkbox8.getText().toString());

        if(chkbox9.isChecked())
            event.add(chkbox9.getText().toString());

        else
            event.remove(chkbox9.getText().toString());

        if(chkbox10.isChecked())
            event.add(chkbox10.getText().toString());

        else
            event.remove(chkbox10.getText().toString());

        if(chkbox11.isChecked())
            event.add(chkbox11.getText().toString());

        else
            event.remove(chkbox11.getText().toString());

        if(chkbox12.isChecked())
            event.add(chkbox12.getText().toString());

        else
            event.remove(chkbox12.getText().toString());


        return event.toString();
    }


    //AsyncTask to send data as a http POST request
    private class PostDataTask extends AsyncTask<String, Void, Boolean> {

        @Override
        protected Boolean doInBackground(String... contactData) {
            Boolean result = true;
            String url = contactData[0];

            String fullname = contactData[1];
            String college = contactData[2];
            String email = contactData[3];
            String phoneno = contactData[4];
            String event= contactData[5];
            String postBody="";

            try {
                //all values must be URL encoded to make sure that special characters like & | ",etc.
                //do not cause problems
                postBody = EMAIL_KEY+"=" + URLEncoder.encode(email, "UTF-8") +
                        "&" + FULL_NAME_KEY + "=" + URLEncoder.encode(fullname,"UTF-8") +
                        "&" + COLLEGE_KEY + "=" + URLEncoder.encode(college,"UTF-8") +
                        "&" + PHONE_kEY + "=" + URLEncoder.encode(phoneno,"UTF-8")+
                        "&" + EVENT_KEY + "=" + URLEncoder.encode(event,"UTF-8");
            } catch (UnsupportedEncodingException ex) {
                result=false;
            }

            /*
            //If you want to use HttpRequest class from http://stackoverflow.com/a/2253280/1261816
            try {
			HttpRequest httpRequest = new HttpRequest();
			httpRequest.sendPost(url, postBody);
		}catch (Exception exception){
			result = false;
		}
            */

            try{
                //Create OkHttpClient for sending request
                OkHttpClient client = new OkHttpClient();
                //Create the request body with the help of Media Type
                RequestBody body = RequestBody.create(FORM_DATA_TYPE, postBody);
                Request request = new Request.Builder()
                        .url(url)
                        .post(body)
                        .build();
                //Send the request
                Response response = client.newCall(request).execute();
            }catch (IOException exception){
                result=false;
            }


            return result;
        }

        @Override
        protected void onPostExecute(Boolean result){
            //Print Success or failure message accordingly
//            mResult=result;
            Toast.makeText(context, result ? "Successfully Registered!" : "Please Check your internet connection or try again after some time.", Toast.LENGTH_LONG).show();

            // to uncheck all the checkboxes and set the edittext blank
            if(result)
            {
                fullnameEdittext.setText("");
                collegeEdittext.setText("");
                emailEditText.setText("");
                phoneEditText.setText("");
                chkbox1.setChecked(false);
                chkbox2.setChecked(false);
                chkbox3.setChecked(false);
                chkbox4.setChecked(false);
                chkbox5.setChecked(false);
                chkbox6.setChecked(false);
                chkbox7.setChecked(false);
                chkbox8.setChecked(false);
                chkbox9.setChecked(false);
                chkbox10.setChecked(false);
                chkbox11.setChecked(false);
                chkbox12.setChecked(false);
            }
        }

    }
}
