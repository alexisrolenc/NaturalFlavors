package com.example.naturalflavors;

import android.content.Intent;
import android.os.CpuUsageInfo;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Expenses extends AppCompatActivity
{
    private EditText mortgage;
    private EditText car;
    private EditText loan;
    private EditText utilities;
    private EditText food;
    private EditText gas;
    private EditText misc;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);


        this.mortgage = (EditText)this.findViewById(R.id.mortgageET);

        this.car = (EditText)this.findViewById(R.id.carET);

        this.loan = (EditText)this.findViewById(R.id.loansET);

        this.utilities = (EditText)this.findViewById(R.id.utilitiesET);

        this.food = (EditText)this.findViewById(R.id.foodET);

        this.gas = (EditText)this.findViewById(R.id.gasET);

        this.misc = (EditText)this.findViewById(R.id.miscET);

        this.total = (TextView)this.findViewById(R.id.totalTV);

       /* String mortgageET = mortgage.getText().toString();

        String carET = car.getText().toString();

        String loanET = loan.getText().toString();

        String utilitiesET = utilities.getText().toString();

        String foodET = food.getText().toString();

        String gasET = gas.getText().toString();

        String miscET = misc.getText().toString();

        String totalET = total.getText().toString();*/



    }

    public void onCalcButtonPressed(View v)
    {
        String morg = mortgage.getText().toString() ;
        Core.mortgage = Integer.parseInt(morg);

        String carr = car.getText().toString() ;
        Core.car = Integer.parseInt(carr);

        String loans = loan.getText().toString() ;
        Core.loans = Integer.parseInt(loans);

        String util = utilities.getText().toString() ;
        Core.utilities = Integer.parseInt(util);

        String foods = food.getText().toString() ;
        Core.food = Integer.parseInt(foods);

        String gass = gas.getText().toString() ;
        Core.utilities = Integer.parseInt(gass);

        String mis = misc.getText().toString() ;
        Core.utilities = Integer.parseInt(mis);


        Core.totalExpenses = Core.mortgage + Core.car + Core.loans + Core.utilities + Core.gas + Core.food + Core.misc;
        total.setText("" + Core.totalExpenses);
    }
    public void onSaveButtonPressed(View v)
    {
        String morg = mortgage.getText().toString() ;
        Core.mortgage = Integer.parseInt(morg);

        String carr = car.getText().toString() ;
        Core.car = Integer.parseInt(carr);

        String loans = loan.getText().toString() ;
        Core.loans = Integer.parseInt(loans);

        String util = utilities.getText().toString() ;
        Core.utilities = Integer.parseInt(util);

        String foods = food.getText().toString() ;
        Core.food = Integer.parseInt(foods);

        String gass = gas.getText().toString() ;
        Core.utilities = Integer.parseInt(gass);

        String mis = misc.getText().toString() ;
        Core.utilities = Integer.parseInt(mis);

        Toast.makeText(this, "Your Expenses Have Been Saved",Toast.LENGTH_SHORT).show();
    }

    public void onGoToNewScreenPressed(View v)
    {
        Intent i = new Intent (this, MonthController.class);
        this.startActivity(i);
    }
}


