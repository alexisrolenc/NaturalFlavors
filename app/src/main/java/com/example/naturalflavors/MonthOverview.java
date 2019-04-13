package com.example.naturalflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MonthOverview extends AppCompatActivity
{
    private TextView prevValAmountTV;
    private TextView newBalAmountTV;
    private TextView monthlyIncomeAmountTV;
    private TextView monthlyExpenseAmountTV;
    private Button editIncomeButton;
    private Button editExpenseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_overview);
        this.prevValAmountTV = (TextView)this.findViewById(R.id.prevValAmountTV);
        this.newBalAmountTV = (TextView)this.findViewById(R.id.newBalAmountTV);
        this.monthlyIncomeAmountTV = (TextView)this.findViewById(R.id.monthlyIncomeAmountTV);
        this.monthlyExpenseAmountTV = (TextView)this.findViewById(R.id.monthlyExpenseAmountTV);
        this.editIncomeButton = (Button)this.findViewById(R.id.editIncomeButton);
        this.editExpenseButton = (Button)this.findViewById(R.id.editExpenseButton);
    }



    public void onEditIncomeButtonPressed(View v)
    {
        Intent i = new Intent(this,EditIncome.class);
        this.startActivity(i);
    }



    public void onEditExpenseButtonPressed(View v)
    {
        Intent i = new Intent(this, EditExpenses.class);
        this.startActivity(i);
    }




}
