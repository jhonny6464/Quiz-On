package com.example.informaticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuRepaso extends AppCompatActivity {
    private ImageView imagenAtras;
    private Button BotonArqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_repaso);

        imagenAtras= findViewById(R.id.imageAtras);
        BotonArqui= findViewById(R.id.btnR_Arqui);



        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuRepaso.this, MenuPrincipal.class);
                startActivity(intent);
            }
        });

        BotonArqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuRepaso.this, RepasoArqui.class);
                startActivity(intent);
            }
        });
    }
}
