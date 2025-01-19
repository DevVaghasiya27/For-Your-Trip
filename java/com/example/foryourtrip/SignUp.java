package com.example.foryourtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button b1;
        EditText mobile,name,email,pass,pass2,pincode;

        b1=findViewById(R.id.signUp);
        mobile=findViewById(R.id.mobileNo);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        pass2=findViewById(R.id.pass2);
        pincode=findViewById(R.id.pinCode);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Mobile = mobile.getText().toString();
                String Name = name.getText().toString();
                String Email = email.getText().toString();
                String password = pass.getText().toString();
                String cfpassword = pass2.getText().toString();
                String pin = pincode.getText().toString();

                if (Mobile.isEmpty() && Name.isEmpty() && cfpassword.isEmpty() && Email.isEmpty() && pin.isEmpty() && password.isEmpty()) {
                    Toast.makeText(SignUp.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }else if(password.equals(cfpassword)) {
//                    ldb.addNewCourse(Name,Email,password);
                    Toast.makeText(SignUp.this, "Signup successful. ", Toast.LENGTH_SHORT).show();
                }


                    Intent i=new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });
    }
}