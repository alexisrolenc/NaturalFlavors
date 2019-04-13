package com.example.naturalflavors;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity
{
    private FirebaseAuth mAuth;
    private EditText firstName;
    private EditText lastName;
    private EditText signUpemail;
    private EditText signUpPassword;
    private EditText confirmPassword;
    private Button signUpButton;
    private SignUp signUpActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();
        this.signUpemail = (EditText)this.findViewById(R.id.emailET);
        this.signUpPassword = (EditText)this.findViewById(R.id.passwordET);
        this.confirmPassword = (EditText)this.findViewById(R.id.confirmET);
        this.signUpButton = (Button)this.findViewById(R.id.signUpButton);
        this.signUpActivity = this;
    }

    public void onSignUpButtonPressed (View v)
    {
        if(signUpemail.getText().toString().equals("") || signUpPassword.getText().toString().equals("") || confirmPassword.getText().toString().equals(""))
        {
            Toast.makeText(signUpActivity, "Enter Information", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(signUpPassword.getText().toString().equals(confirmPassword.getText().toString()))
            {
                mAuth.createUserWithEmailAndPassword(signUpemail.getText().toString(), signUpPassword.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful())
                        {
                            Core.currentUser = mAuth.getCurrentUser();
                            Intent i = new Intent(signUpActivity, MainActivity.class);
                            signUpActivity.startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(signUpActivity, "Sign Up Failed Make Sure All Fields are Filled.", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
            else
            {
                Toast.makeText(signUpActivity, "Passwords don't match!", Toast.LENGTH_SHORT).show();
            }

        }
    }


}
