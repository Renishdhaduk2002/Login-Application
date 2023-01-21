package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //retrieve(value assign)
        username = findViewById(R.id.textUsername);
        password = findViewById(R.id.textPasword);
    }

    public void Login(View view) {
        String uname = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        // username empty
        if (uname.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter Username", Toast.LENGTH_LONG).show();

        // password empty
        else if (pass.equals(""))
            Toast.makeText(getApplicationContext(), "Please enter Password", Toast.LENGTH_LONG).show();
        else {
            if (uname.equals("Renish") && pass.equals("123"))
            {
                // jump one activity to another activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("user",uname);
                startActivity(intent);
            }
            else {
                //if login failed then display this activity
                Toast.makeText(getApplicationContext(),"Login Failed...",Toast.LENGTH_LONG).show();
            }
        }
    }
}