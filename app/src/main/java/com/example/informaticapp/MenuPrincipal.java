package com.example.informaticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MenuPrincipal extends AppCompatActivity {

    private ImageView imageRepaso;
    private ImageView imagenAtras;
    private ImageView imageQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        imageRepaso= findViewById(R.id.imageView);
        imagenAtras= findViewById(R.id.imageAtras);
        imageQuiz=findViewById(R.id.imageView1);

        imageRepaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, MenuRepaso.class);
                startActivity(intent);
            }

        });
        imageQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, MenuQuiz.class);
                startActivity(intent);
            }

        });
    }
}
