package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView t1,t2;
    String chc;
    Double prc;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=(TextView) findViewById(R.id.listView);
        t2=(TextView) findViewById(R.id.priceView);
        b1=(Button) findViewById(R.id.reorder);
        b2=(Button) findViewById(R.id.cnf);


        Bundle bun = getIntent().getExtras();
        chc=bun.getString("Choices");
        prc=bun.getDouble("Price");
        t1.setText(chc);
        t2.setText("Total : Rs"+prc.toString());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                Intent obj=new Intent(Main4Activity.this,
                        list_view.class);
                startActivity(obj);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Main4Activity.this,
                        Main9Activity.class);
                startActivity(obj);

            }
        });


    }



    }



