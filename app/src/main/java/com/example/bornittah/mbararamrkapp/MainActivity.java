package com.example.bornittah.mbararamrkapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"food","fruits","sourceflavors","teasupplements"};

    private Context cont;
    String customers_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cont=MainActivity.this;


        int config=getResources().getConfiguration().orientation;
        if(config== Configuration.ORIENTATION_LANDSCAPE){


            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout Layout1= (RelativeLayout) findViewById(R.id.food);
                RelativeLayout Layout2= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout Layout3= (RelativeLayout) findViewById(R.id.sourceflavors);
                RelativeLayout Layout4= (RelativeLayout) findViewById(R.id.teasupplements);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    customers_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (customers_choice){
                        case "food":

                            Layout1.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);

                            break;
                        case "fruits":

                            Layout2.setVisibility(View.VISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                        case "sourceflavors":
                            Layout3.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;
                        case "teasupplements":
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.VISIBLE);
                            break;

                    }
                }
            });


        }

        else if(config== Configuration.ORIENTATION_PORTRAIT){


            setContentView(R.layout.potrait);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(cont,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout Layout1= (RelativeLayout) findViewById(R.id.food);
                RelativeLayout Layout2= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout Layout3= (RelativeLayout) findViewById(R.id.sourceflavors);
                RelativeLayout Layout4= (RelativeLayout) findViewById(R.id.teasupplements);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    customers_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (customers_choice){
                        case "food":

                            Layout1.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);

                            break;
                        case "fruits":

                            Layout2.setVisibility(View.VISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;
                        case "sourceflavors":

                            Layout3.setVisibility(View.VISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                        case "teasupplements":
                            Layout4.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            break;

                    }
                }
            });


        }

    }

}



