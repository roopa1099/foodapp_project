package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;


import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;

import android.content.DialogInterface;
public class MainActivity extends AppCompatActivity {
    Button signupButton,loginButton;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signupButton = (Button) findViewById(R.id.button);
        loginButton=(Button) findViewById(R.id.button1);
        builder = new AlertDialog.Builder(this);
        TextView textView=findViewById(R.id.textv);
        String str="KHAANA KHAZANA";
        SpannableString ss=new SpannableString(str);
        StyleSpan bolds=new StyleSpan(Typeface.BOLD);
        ss.setSpan(bolds,0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj=new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(obj);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj=new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(obj);
            }
        });
    }
}