package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ADMIN extends AppCompatActivity {
    Button loginButton;
    EditText pname, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_d_m_i_n);

        loginButton=(Button) findViewById(R.id.button7);
        pname=(EditText) findViewById(R.id.editText);
        pass=(EditText) findViewById(R.id.editText4);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=pname.getText().toString();
                String s2=pass.getText().toString();
                if(s1.equals("admin")){
                    if(s2.equals("pass@123")){
                        Intent obj=new Intent(ADMIN.this,
                                Admin1.class);
                        startActivity(obj);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Wrong Password, retry!!!!",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Username, retry!!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
