package com.example.foryourtrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText mobileNo,password;
        Button b1;

        mobileNo=findViewById(R.id.mobileNo);
        password=findViewById(R.id.password);
        b1 = findViewById(R.id.login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = mobileNo.getText().toString();
                String s2 = password.getText().toString();

                if (s1.equals("6352450648") && s2.equals("admin")){
                Intent i=new Intent(getApplicationContext(), HomePage.class);
                startActivity(i);
            }
                else {
                    Toast.makeText(Login.this, "Mobile No. Or Password Not Match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}