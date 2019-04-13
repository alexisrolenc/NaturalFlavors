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

    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    static DatabaseReference mDatabase = database.getReference();

}
