package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_egg, btn_degg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hittar id
        btn_egg = findViewById(R.id.btn_Egg);
        btn_degg = findViewById(R.id.btn_Degg);




        //gör eventet för vad som händer när du trycker på Ägg
        btn_egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //går från main till egg layout
                Intent intent = new Intent(MainActivity.this, Egg_layout.class);
                startActivity(intent);
            }
        });



        //Samma sak fast på dägg knappen, vi åker till dägg layouten istället
        btn_degg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Degg_layout.class);
                startActivity(intent);
            }
        });


    }
}