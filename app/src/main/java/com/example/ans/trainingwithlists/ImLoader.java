package com.example.ans.trainingwithlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ImLoader extends AppCompatActivity
{
    private List<State> states = new ArrayList();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_loader);

        setInitialData();

        countriesList = findViewById(R.id.countriesList);

        StateAdapter stateAdapter = new StateAdapter(ImLoader.this,R.layout.list_item,states);

        countriesList.setAdapter(stateAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                State selectedState = (State)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Был выбран пункт " + selectedState.getName(),Toast.LENGTH_SHORT).show();
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData()
    {
        states.add(new State("Астрия", "Вена", R.drawable.austria_l));
        states.add(new State("Албания", "Тирана", R.drawable.albania_l));
        states.add(new State("Алгерия", "Алжир", R.drawable.algeria_l));
        states.add(new State("Азербайджан", "Баку", R.drawable.azerbaijan_l));
        states.add(new State("Австралия", "Канберра", R.drawable.australia_l));
        states.add(new State("Астрия", "Вена", R.drawable.austria_l));
        states.add(new State("Албания", "Тирана", R.drawable.albania_l));
        states.add(new State("Алгерия", "Алжир", R.drawable.algeria_l));
        states.add(new State("Азербайджан", "Баку", R.drawable.azerbaijan_l));
        states.add(new State("Австралия", "Канберра", R.drawable.australia_l));
        states.add(new State("Астрия", "Вена", R.drawable.austria_l));
        states.add(new State("Албания", "Тирана", R.drawable.albania_l));
        states.add(new State("Алгерия", "Алжир", R.drawable.algeria_l));
        states.add(new State("Азербайджан", "Баку", R.drawable.azerbaijan_l));
        states.add(new State("Австралия", "Канберра", R.drawable.australia_l));
    }
}
