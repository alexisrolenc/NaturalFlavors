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
    private EditText salary;
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
        this.firstName = (EditText)this.findViewById(R.id.fNameET);
        this.lastName = (EditText)this.findViewById(R.id.lNameET);

        this.salary = (EditText) this.findViewById(R.id.salaryET);
        this.signUpActivity = this;
    }

    public void onSignUpButtonPressed (View v)
    {
        if(signUpemail.getText().toString().equals("") || signUpPassword.getText().toString().equals("") || confirmPassword.getText().toString().equals("") || firstName.getText().toString().equals("") || lastName.getText().toString().equals("") || salary.getText().toString().equals(""))
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
                            String sal = salary.getText().toString() ;
                            Core.salary = Integer.parseInt(sal);
                            Core.fName = firstName.getText().toString();
                            Core.lName = lastName.getText().toString();



                            Intent i = new Intent(signUpActivity, LandingPage.class);
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

    public void setupUser(String fname, String lname, String email, int salary)
    {
        char f = 'c';
        for(int i = 0; i < 1; i++)
        {
            f = fname.charAt(i);
        }
        String s = String.valueOf(f);
        String userName = s + lastName + salary;
        String fullName = fname + " " + lastName;

        User user = new User(userName, fullName, email, salary);

        Core.mDatabase.child("users").child(userName).setValue(user);

    }
}
