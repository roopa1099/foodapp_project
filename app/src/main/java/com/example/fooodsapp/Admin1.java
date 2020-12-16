package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin1 extends AppCompatActivity {

    Button edit, add, lgout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin1);

        edit = (Button) findViewById(R.id.button5);
        add = (Button) findViewById(R.id.button4);
        lgout = (Button) findViewById(R.id.button9);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(Admin1.this,
                        EditRest.class);
                startActivity(obj);
            }

        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(Admin1.this,
                        NewRest.class);
                startActivity(obj);
            }

        });


        lgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(Admin1.this,
                        ADMIN.class);
                startActivity(obj);
            }

        });



    }
}