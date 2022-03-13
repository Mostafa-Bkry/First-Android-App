package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name, pass;
    String username, password;
    //TextView problem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        //problem = findViewById(R.id.invalid);
        Button login =  findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = name.getText().toString();
                password = pass.getText().toString();

                startActivity(new Intent(MainActivity.this, MainActivity2.class));

                /*
                if (username == "Mo" && password == "123") {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
                else {
                    problem.setText("Invalid UserName or Password!!");
                }

                 */
            }
        });

    }
}