package com.example.naturalflavors;

import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Core
{
    static FirebaseUser currentUser;
    static Integer salary;
    static String fName;
    static String lName;
    static Integer mortgage;
    static Integer car;
    static Integer loans;
    static Integer utilities;
    static Integer food;
    static Integer gas;
    static Integer misc;
    static int totalExpenses;

    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    static DatabaseReference mDatabase = database.getReference();

}
