package com.example.exercise_pam_d;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Adapter;

import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity {

    Button ButtonLogin, ButtonSignUp;

    EditText EditEmail, EditPassword;

    String Name, Password;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonSignUp = findViewById(R.id.ButtonSignUp);
        ButtonLogin = findViewById(R.id.ButtonSignIn);
        EditEmail = findViewById(R.id.EditTextEmail);
        EditPassword = findViewById(R.id.EditTextPassword);



        ButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(getApplicationContext(), ActivityDaftar.class);
                startActivity(j);

            }
        });

        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = EditEmail.getText().toString();

                Password = EditPassword.getText().toString();

                String email = "emailcontoh@mail.com";

                String pass = "123";

                if(EditEmail.getText().toString().equals("emailcontoh@mail.com")&& EditPassword.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Succeed", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", Name.trim());

                    b.putString("b", Password.trim());

                    Intent i = new Intent(getApplicationContext(), HomeActivity.class);

                    i.putExtras(b);

                    startActivity(i);



                }
                else if (Name.isEmpty() && Password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Email & Password Required to Fill", Toast.LENGTH_SHORT).show();
                    EditEmail.setError("Fill Email!!!");
                    EditPassword.setError("Fill Password!!!");
                }
                else if (Name.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Email Required to Fill", Toast.LENGTH_SHORT).show();
                    EditEmail.setError("Fill Email!!!");
                }
                else if (Password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Password Required to Fill", Toast.LENGTH_SHORT).show();
                    EditEmail.setError("Fill Password!!!");
                }
            }
        });
    }
}



