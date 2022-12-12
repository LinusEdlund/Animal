package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Egg_layout extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button btn_AddOne;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_layout);

        //om jag inte gör det här läggs väldena varje gång man går ut och in i layouten
        //de fördubblas




        // Hitta RecyclerView-komponenten i layouten
        recyclerView = findViewById(R.id.lv_eggList);

        // Ställ in en fast storlek för RecyclerView
        recyclerView.setHasFixedSize(true);

        // Skapa en ny LinearLayoutManager och ställ in den som layouthanterare för RecyclerView
        layoutManager = new LinearLayoutManager(Egg_layout.this);
        recyclerView.setLayoutManager(layoutManager);

        // Skapa en instans av adaptern och ange vilken data den ska visa
        EggAdapter adapter = new EggAdapter(Egg.eggList,Egg_layout.this);

        // Koppla adaptern till RecyclerView
        recyclerView.setAdapter(adapter);



        //event som gå till AddEgg när du klickar på knappen AddOne i egg menyn
        btn_AddOne = findViewById(R.id.btn_addOneEgg);
        btn_AddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Egg_layout.this, AddEgg.class);
                startActivity(intent);
            }
        });

    }


}