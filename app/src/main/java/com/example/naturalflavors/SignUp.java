package com.example.naturalflavors;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignUp extends AppCompatActivity
{
    private FirebaseAuth mAuth;
    private EditText firstName;
    private EditText lastName;
    private EditText signUpEmail;
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
        this.signUpEmail = (EditText)this.findViewById(R.id.emailET);
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
        if(signUpEmail.getText().toString().equals("") || signUpPassword.getText().toString().equals("") || confirmPassword.getText().toString().equals("") || firstName.getText().toString().equals("") || lastName.getText().toString().equals("") || salary.getText().toString().equals(""))
        {
            Toast.makeText(signUpActivity, "Enter Information", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(signUpPassword.getText().toString().equals(confirmPassword.getText().toString()))
            {
                mAuth.createUserWithEmailAndPassword(signUpEmail.getText().toString(), signUpPassword.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
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
                            String email = signUpEmail.getText().toString();

                            setupNewUser(Core.fName, Core.lName, email, Core.salary);

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

    private void setupNewUser(String firstName, String lastName, String email, int salary)
    {
        char firstInitial = 'C';
        for(int i = 0; i < 1; i ++)
        {
            firstInitial = firstName.charAt(i);
        }
        String f = String.valueOf(firstInitial);
        String userName = f + lastName + salary;
        String name = firstName + " " + lastName;
        User user = new User(userName, name, email, salary);
        Core.mDatabase.child("users").child(userName).setValue(user);
    }

}
