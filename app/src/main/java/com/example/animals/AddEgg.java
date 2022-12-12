package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEgg extends AppCompatActivity {

    private Button btn_cancle, btn_ok;
    private EditText et_NameAddEgg, et_AgeAddEgg, et_imgEgg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_egg);

        //hittar all id som är nödvändiga
        btn_cancle = findViewById(R.id.btn_cancelEgg);
        btn_ok = findViewById(R.id.btn_okEgg);
        et_AgeAddEgg = findViewById(R.id.et_AgeAddEgg);
        et_NameAddEgg = findViewById(R.id.et_NameAddEgg);
        et_imgEgg = findViewById(R.id.et_URLEgg);

        // vi bara går tillbaka
        btn_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEgg.this, Egg_layout.class);
                startActivity(intent);
            }
        });



        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = et_NameAddEgg.getText().toString();
                int age = Integer.parseInt(et_AgeAddEgg.getText().toString());
                String bild = et_imgEgg.getText().toString();

                Egg add = new Egg(name,age,bild);

                Intent intent = new Intent(AddEgg.this, Egg_layout.class);
                startActivity(intent);


            }
        });











    }
}