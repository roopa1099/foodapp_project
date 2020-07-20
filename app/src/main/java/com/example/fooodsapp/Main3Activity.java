package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    DBhelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        db = new DBhelper(this);
        e1 = (EditText) findViewById(R.id.editText_usrn);

        e2 = (EditText) findViewById(R.id.editText_pswd);
        b1 = (Button) findViewById(R.id.button_lg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u1=e1.getText().toString();
                String p1=e2.getText().toString();
                Boolean chck=db.usrpsw(u1,p1);
                if (chck==true){
                    Intent obj=new Intent(Main3Activity.this,
                            Main5Activity.class);
                    startActivity(obj);
                }
                else
                    Toast.makeText(getApplicationContext(),"Wrong username or password",Toast.LENGTH_SHORT).show();


            }
        });
    }
}
