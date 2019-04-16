package com.example.naturalflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditIncome extends AppCompatActivity
{
    private EditText incType2;
    private EditText incType3;
    private EditText incType4;
    private EditText incType5;
    private EditText incType6;
    private EditText incType7;
    private EditText incType8;
    private EditText incType9;
    private EditText incType10;
    private EditText income2;
    private EditText income3;
    private EditText income4;
    private EditText income5;
    private EditText income6;
    private EditText income7;
    private EditText income8;
    private EditText income9;
    private EditText income10;
    private EditText salaryAmount;
    private int buttonClickCount = 2;
    private EditIncome EditIncomeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_income);
        this.incType2 = (EditText) findViewById(R.id.incType2ET);
        this.incType3 = (EditText) findViewById(R.id.incType3ET);
        this.incType4 = (EditText) findViewById(R.id.incType4ET);
        this.incType5 = (EditText) findViewById(R.id.incType5ET);
        this.incType6 = (EditText) findViewById(R.id.incType6ET);
        this.incType7 = (EditText) findViewById(R.id.incType7ET);
        this.incType8 = (EditText) findViewById(R.id.incType8ET);
        this.incType9 = (EditText) findViewById(R.id.incType9ET);
        this.incType10 = (EditText) findViewById(R.id.incType10ET);
        this.income2 = (EditText) findViewById(R.id.income2ET);
        this.income3 = (EditText) findViewById(R.id.income3ET);
        this.income4 = (EditText) findViewById(R.id.income4ET);
        this.income5 = (EditText) findViewById(R.id.income5ET);
        this.income6 = (EditText) findViewById(R.id.income6ET);
        this.income7 = (EditText) findViewById(R.id.income7ET);
        this.income8 = (EditText) findViewById(R.id.income8ET);
        this.income9 = (EditText) findViewById(R.id.income9ET);
        this.income10 = (EditText) findViewById(R.id.income10ET);
        this.salaryAmount = (EditText) findViewById(R.id.salaryET);
        incType2.setVisibility(View.GONE);
        incType3.setVisibility(View.GONE);
        incType4.setVisibility(View.GONE);
        incType5.setVisibility(View.GONE);
        incType6.setVisibility(View.GONE);
        incType7.setVisibility(View.GONE);
        incType8.setVisibility(View.GONE);
        incType9.setVisibility(View.GONE);
        incType10.setVisibility(View.GONE);
        income2.setVisibility(View.GONE);
        income3.setVisibility(View.GONE);
        income4.setVisibility(View.GONE);
        income5.setVisibility(View.GONE);
        income6.setVisibility(View.GONE);
        income7.setVisibility(View.GONE);
        income8.setVisibility(View.GONE);
        income9.setVisibility(View.GONE);
        income10.setVisibility(View.GONE);
        this.EditIncomeActivity = this;
    }

    public void onAddIncomeButtonPressed (View v)
    {
        if(buttonClickCount == 2)
        {
            incType2.setVisibility(View.VISIBLE);
            income2.setVisibility(View.VISIBLE);
        }
        else if (buttonClickCount ==3)
        {
            incType3.setVisibility(View.VISIBLE);
            income3.setVisibility(View.VISIBLE);
        }
        else if (buttonClickCount == 4)
        {
            incType4.setVisibility(View.VISIBLE);
            income4.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 5)
        {
            incType5.setVisibility(View.VISIBLE);
            income5.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 6)
        {
            incType6.setVisibility(View.VISIBLE);
            income6.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 7)
        {
            incType7.setVisibility(View.VISIBLE);
            income7.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 8)
        {
            incType8.setVisibility(View.VISIBLE);
            income8.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 9)
        {
            incType9.setVisibility(View.VISIBLE);
            income9.setVisibility(View.VISIBLE);
        }
        else if(buttonClickCount == 10)
        {
            incType10.setVisibility(View.VISIBLE);
            income10.setVisibility(View.VISIBLE);
        }
        else
        {
            Toast.makeText(EditIncomeActivity,"Cannot add anymore income fields", Toast.LENGTH_LONG);
        }
        buttonClickCount = buttonClickCount + 1;
    }

    public void doneButtonPressed (View v)
    {
        Intent i = new Intent(this, MonthController.class);
        this.startActivity(i);

    }
}
