package com.example.informaticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuQuiz extends AppCompatActivity {

    private Button BotonArqui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);

        BotonArqui= findViewById(R.id.btnR_Arqui);

        BotonArqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuQuiz.this, StartActivity.class);
                startActivity(intent);
            }

        });
    }
}