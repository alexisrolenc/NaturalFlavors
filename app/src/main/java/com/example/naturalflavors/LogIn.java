package com.example.naturalflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
    }

    public void onLogInButtonPressed (View v)
    {
        Intent i = new Intent (this, MainActivity.class);
        this.startActivity(i);
    }

    public void onCreateAccountButtonPressed (View v)
    {
        Intent i = new Intent (this, SignUp.class);
        this.startActivity(i);
    }
}
