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

public class Main6Activity extends AppCompatActivity {
    String choices = "";
    Double price = 0.00;
    Button bill,l;
    String food[] = new String[]{"Coffee 25/-", "Chocolate Shake 50/-", "Tea 20/-","Ice Cream(Any flavour) 40/-", "Banana Shake 50/-", "Pepsi 30/-", "Coke 30/-", "Choco-Lava Cake 110/-", "Choco-Brownie 125/-", "Choco Mousse 125/-", "Veg Fried Rice 125/-", "Non-Veg Fried Rice 135/-", "Chole Bhature 150/-", "Chicken Kadhai 165/-", "Tandoori Roti 7/-", " Aalu Parantha 15/-", "White Sauce Pasta(Veg) 135/-", "White Sauce Pasta(Non-Veg) 145/-", "Red Sauce Pasta(Veg) 135/-", "Red Sauce Pasta(Non-Veg) 145/-", "Veg Chowmein 130/-", "Chicken Chowmein 150/-", "Gobi Manchurian 110/-", "French-Fries 80/-", "Garlic-Bread 125/-", "Potato-Wedges 85/-", "Chilli Chicken 155/-", "Chicken-Popcorn 105/-", "Chicken Hyderabadi 125 /-", "Chicken Biryani 160/-","Pav Bhaji 120/-","Masala Dosa 110/-"};
    int rate[] = new int[]{40, 50, 60, 50, 30, 30, 110, 125, 125, 125, 135, 150, 165, 170, 200, 135, 145, 135, 145, 130, 150, 110, 80, 125, 85, 155, 105, 125, 123};

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

                Intent i= new Intent(Main6Activity.this,Main4Activity.class);
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
                Intent obj=new Intent(Main6Activity.this,
                        Main11Activity.class);
                startActivity(obj);

            }
        });

    }
}
