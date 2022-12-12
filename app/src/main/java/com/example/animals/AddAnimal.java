package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddAnimal extends AppCompatActivity {

    private Button btn_cancle, btn_ok;
    private EditText et_NameAddEgg, et_AgeAddEgg, et_imgEgg;
    private RadioButton rb_egg, rb_degg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_animals);

        //hittar all id som är nödvändiga
        btn_cancle = findViewById(R.id.btn_cancelEgg);
        btn_ok = findViewById(R.id.btn_okEgg);
        et_AgeAddEgg = findViewById(R.id.et_AgeAddEgg);
        et_NameAddEgg = findViewById(R.id.et_NameAddEgg);
        et_imgEgg = findViewById(R.id.et_URLEgg);
        rb_degg = findViewById(R.id.rb_degg);
        rb_egg = findViewById(R.id.rb_egg);




        // vi bara går tillbaka
        btn_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddAnimal.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // Register a listener for the radio button
        /*
        rb_egg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Check if the radio button is checked
                if (isChecked) {
                    // Create a new object of Egg and add it to the list
                    new Egg("Egg1", 1, "http://example.com/egg1.jpg", 1);
                }
            }
        });
        */

        rb_egg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        rb_degg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_NameAddEgg.getText().toString();
                int age = Integer.parseInt(et_AgeAddEgg.getText().toString());
                String url = et_imgEgg.getText().toString();

                // Check if the radio button is checked
                if (rb_egg.isChecked()){

                    new Egg(name, age, url, 2);

                    Intent intent = new Intent(AddAnimal.this, MainActivity.class);
                    startActivity(intent);
                }

                if (rb_degg.isChecked()){

                    new Degg(name, age, url, 1);

                    Intent intent = new Intent(AddAnimal.this, MainActivity.class);
                    startActivity(intent);
                }


            }
        });



    }
}