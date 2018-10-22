package com.example.ans.trainingwithlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.selection);
        /*we call countries in xml*/

        final String[] countries = getResources().getStringArray(R.array.countires);

        final ListView countriesList = findViewById(R.id.countriesList);

        ArrayAdapter<String> adapter =  new ArrayAdapter
        (MainActivity.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.countires));

        countriesList.setAdapter(adapter);

        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                textView.setText(countries[position]);
            }
        });
    }
}
