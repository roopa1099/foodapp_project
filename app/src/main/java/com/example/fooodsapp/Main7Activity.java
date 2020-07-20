package com.example.fooodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    String choices = "";
    Double price = 0.00;
    Button bill,l;
    String food[] = new String[]{"Dahi Gupchup 40/-", "Pani Puri 20/-", "Veg Maggie 30/-", "Egg Maggie 40/-", "Chicken Maggie 45/-", "Veg Steamed Momos 30/-", "Veg Tandoori Momos 40/-", "Chicken Steamed Momos 50/-", "Chicken tandoori Momos 60/-", "Veg Roll 50/-", "Egg Roll 60/-", "Chicken Roll 70 /-"};
    int rate[] = new int[]{40, 20,30,40,45,30,40,50,60,50,60,70};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listview = (ListView) findViewById(R.id.list_food);
        Button bill = (Button) findViewById(R.id.button_next);
        l = (Button) findViewById(R.id.button2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, food);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                choices = choices + food[position];
                price = price + rate[position];
                Toast.makeText(getApplicationContext(), food[position]+"selected", Toast.LENGTH_SHORT).show();

            }


        });
        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Main7Activity.this,Main4Activity.class);
                Bundle bun=new Bundle();
                bun.putString("Choices",choices);
                bun.putDouble("Price",price);
                i.putExtras(bun);
                startActivity(i);


            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Main7Activity.this,
                        Main12Activity.class);
                startActivity(obj);

            }
        });


    }
}
