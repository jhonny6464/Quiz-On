package com.example.informaticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RepasoArqui extends AppCompatActivity {

    private ImageView imagenAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repaso_arqui);

        imagenAtras= findViewById(R.id.imageAtras1);

        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RepasoArqui.this, MenuRepaso.class);
                startActivity(intent);
            }
        });
    }
}