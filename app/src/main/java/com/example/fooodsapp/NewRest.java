package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NewRest extends AppCompatActivity {

    TextView tname,taddress,tcity,tstate;
    Button next;
    RadioGroup rdgp;
    RadioButton rdbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_rest);
        tname = (TextView) findViewById(R.id.textView6);
        taddress = (TextView) findViewById(R.id.textView7);
        tcity = (TextView) findViewById(R.id.textView8);
        tstate = (TextView) findViewById(R.id.textView9);
        next = (Button) findViewById(R.id.button6);
        rdgp = findViewById(R.id.radiogrp);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=tname.getText().toString();
                String addr=taddress.getText().toString();
                String city=tcity.getText().toString();
                String state=tstate.getText().toString();
                int rid=rdgp.getCheckedRadioButtonId();
                rdbtn=findViewById(rid);
                String type= (String) rdbtn.getText();

                Intent i = new Intent(NewRest.this, NewRestFood.class);
                Bundle bun = new Bundle();
                bun.putString("restname",name);
                bun.putString("restaddr",addr);
                bun.putString("restcity",city);
                bun.putString("reststate",state);
                bun.putString("resttype",type);
                i.putExtras(bun);
                startActivity(i);


            }
        });


    }

    public void checkButton(View v){
       int rid=rdgp.getCheckedRadioButtonId();
        rdbtn=findViewById(rid);


    }

}