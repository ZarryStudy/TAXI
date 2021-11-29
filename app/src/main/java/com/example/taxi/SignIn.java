package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button btnSignIn = findViewById(R.id.SignInBtn);
        btnSignIn.setOnClickListener(this::onClick);
        TextView NewAcc = findViewById(R.id.CreateAccTv);
        NewAcc.setOnClickListener(this::onClick);
        setTitle("Taxi");
    }
    @SuppressLint("NonConstantResourceId")
    public  void  onClick(View view ){
        switch (view.getId())
        {
            case R.id.SignInBtn:
                Intent i = new Intent(this, StartActivity.class);
                startActivity(i);
                break;
            case R.id.CreateAccTv:
                Intent in = new Intent(this, SignUp.class);
                startActivity(in);
                break;
        }


    }
}