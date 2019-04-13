package com.example.naturalflavors;

import android.widget.EditText;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.widget.TextView;

public class Core
{
    static FirebaseUser currentUser;
    static Integer salary;
    static String fName;
    static String lName;
    static String mortgage;
    static String loans;
    static String car;
    static String utilities;
    static String food;
    static String gas;
    static String misc;
    static int totalExpenses;


    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    static DatabaseReference mDatabase = database.getReference();

    static TextView janBalance, febBalance, marBalance, aprBalance, mayBalance, junBalance, julBalance,
            augBalance, sepBalance, octBalance, novBalance, decBalance;

    //Getters for month TextViews
    public static TextView getJanBalance()
    {
        return janBalance;
    }

    public static TextView getFebBalance()
    {
        return febBalance;
    }

    public static TextView getMarBalance()
    {
        return marBalance;
    }

    public static TextView getAprBalance()
    {
        return aprBalance;
    }

    public static TextView getMayBalance()
    {
        return mayBalance;
    }

    public static TextView getJunBalance()
    {
        return junBalance;
    }

    public static TextView getJulBalance()
    {
        return julBalance;
    }

    public static TextView getAugBalance()
    {
        return augBalance;
    }

    public static TextView getSepBalance()
    {
        return sepBalance;
    }

    public static TextView getOctBalance()
    {
        return octBalance;
    }

    public static TextView getNovBalance()
    {
        return novBalance;
    }

    public static TextView getDecBalance()
    {
        return decBalance;
    }


    //Setters for month TextViews.
    public static void setJanBalance(TextView janBalance)
    {
        Core.janBalance = janBalance;
    }

    public static void setFebBalance(TextView febBalance)
    {
        Core.febBalance = febBalance;
    }

    public static void setMarBalance(TextView marBalance)
    {
        Core.marBalance = marBalance;
    }

    public static void setAprBalance(TextView aprBalance)
    {
        Core.aprBalance = aprBalance;
    }

    public static void setMayBalance(TextView mayBalance)
    {
        Core.mayBalance = mayBalance;
    }

    public static void setJunBalance(TextView junBalance)
    {
        Core.junBalance = junBalance;
    }

    public static void setJulBalance(TextView julBalance)
    {
        Core.julBalance = julBalance;
    }

    public static void setAugBalance(TextView augBalance)
    {
        Core.augBalance = augBalance;
    }

    public static void setSepBalance(TextView sepBalance)
    {
        Core.sepBalance = sepBalance;
    }

    public static void setOctBalance(TextView octBalance)
    {
        Core.octBalance = octBalance;
    }

    public static void setNovBalance(TextView novBalance)
    {
        Core.novBalance = novBalance;
    }

    public static void setDecBalance(TextView decBalance)
    {
        Core.decBalance = decBalance;
    }
}//class
