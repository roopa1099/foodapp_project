package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    DBhelper db;
    EditText edt_name, edt_phn, edt_usr, edt_psw;
    Button rgstr,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        db=new DBhelper(this);
        edt_name = (EditText) findViewById(R.id.editText_name);

        edt_phn = (EditText) findViewById(R.id.editText_phn);
        edt_usr = (EditText) findViewById(R.id.editText_usr);
        edt_psw = (EditText) findViewById(R.id.editText_npsw);
        rgstr = (Button) findViewById(R.id.button_rgs);
        login = (Button) findViewById(R.id.button_lgn);
        rgstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edt_name.getText().toString();

                String s3=edt_phn.getText().toString();
                String s4=edt_usr.getText().toString();
                String s5=edt_psw.getText().toString();
                if(s1.equals("")||s3.equals("")||s4.equals("")||s5.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean chckusr=db.chckusr(s4);
                    if(chckusr==true){
                        Boolean insert=db.insert(s1,s3,s4,s5);
                        if(insert==true){
                            Toast.makeText(getApplicationContext(),"Registered Successfully ,Now login to continue ",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Username already exists",Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Main2Activity.this,
                        Main3Activity.class);
                startActivity(obj);
            }
        });
    }
}