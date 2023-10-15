package com.example.informaticapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {

    private EditText etEmail, etNombre, etContraseña;
    private Button btnRegistrar;
    private TextView tvGoToLogin;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Inicializar FirebaseAuth
        mAuth = FirebaseAuth.getInstance();

        etEmail = findViewById(R.id.editTextEmail);
        etNombre = findViewById(R.id.editTextNombre);
        etContraseña = findViewById(R.id.editTextContraseña);
        btnRegistrar = findViewById(R.id.buttonRegistrar);
        tvGoToLogin = findViewById(R.id.tv_go_to_login);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etContraseña.getText().toString();


                // Registrar el usuario con Firebase Authentication
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Registro exitoso
                                    Toast.makeText(Registro.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();
                                } else {
                                    // Error en el registro
                                    Toast.makeText(Registro.this, "Error al registrar usuario", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        tvGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registro.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
