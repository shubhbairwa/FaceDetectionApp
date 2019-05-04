package com.example.face_detction;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ResultDialog extends DialogFragment {
private Button okButton;
private TextView REsultTV;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment,container,false);
       String result="";
       okButton=view.findViewById(R.id.result_ok_button);

       REsultTV=view.findViewById(R.id.result_text_view);


       Bundle bundle=getArguments();  //becasue we have bundle of string
       result=bundle.getString(LCoDetection.RESULT_TEXT);


       REsultTV.setText(result);


       okButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dismiss();
           }
       });



        return view;
    }
}

