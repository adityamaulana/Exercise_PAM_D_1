package com.example.exercise_pam_d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ActivityDaftar extends AppCompatActivity {

    EditText EditNama, EditAddress, EditEmail, EditPassword, EditRePassword;

    Button BtnRegister, BtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        BtnBack = findViewById(R.id.ButtonBack);
        BtnRegister = findViewById(R.id.ButtonRegister);
        EditNama = findViewById(R.id.editTextTextPersonName);
        EditAddress = findViewById(R.id.editTextTextAddress);
        EditEmail = findViewById(R.id.editTextTextEmailAddress);
        EditPassword = findViewById(R.id.editTextTextPassword);
        EditRePassword = findViewById(R.id.editTextTextRePassword);

        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (EditNama.getText().toString(). isEmpty() ||
                        EditAddress.getText().toString().isEmpty() ||
                        EditEmail.getText().toString().isEmpty() ||
                        EditPassword.getText().toString().isEmpty() ||
                        EditRePassword.getText().toString().isEmpty())
                {
                    EditNama.setError("Input Nama");
                    EditAddress.setError("Input Address");
                    EditEmail.setError("Input Email");
                    EditPassword.setError("Input Password");
                    EditRePassword.setError("Input Re-Password");
                }
                else
                {
                    if (EditPassword.getText().toString().equals(EditRePassword.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Registration Succeed",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password Doesn't Match",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}