package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    String rest[]=new String[] {"ABC Foods","XYZ Family Restaurant","Gupta Fast Foods","KFC","Maharshi Restaurant","Burger King","Dominos","Pizza Hut","Little Chef"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ListView listview = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rest);
        listview.setAdapter(adapter);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent obj=new Intent(Main5Activity.this,
                            list_view.class);
                    startActivity(obj);
                }
                else if(position==1){
                    Intent obj=new Intent(Main5Activity.this,
                            Main6Activity.class);
                    startActivity(obj);

                }
                else{
                    Intent obj=new Intent(Main5Activity.this,
                            Main7Activity.class);
                    startActivity(obj);

                }

            }


        });

    }
}
