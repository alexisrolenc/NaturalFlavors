package com.example.naturalflavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MonthController extends AppCompatActivity
{
    private Button januaryBT, februaryBT, marchBT, aprilBT, mayBT, juneBT, julyBT,
            augustBT, septemberBT,octoberBT, novemberBT, decemberBT;
    private String janBTString, febBTString, marBTString, aprBTString, mayBTString, junBTString,
            julBTString, augBTString, sepBTString, octBTString, novBTString, decBTString;

    private TextView janBalance = Core.getJanBalance(),
            febBalance = Core.getFebBalance(),
            marBalance = Core.getMarBalance(),
            aprBalance = Core.getAprBalance(),
            mayBalance = Core.getMayBalance(),
            junBalance = Core.getJunBalance(),
            julBalance = Core.getJulBalance(),
            augBalance = Core.getAugBalance(),
            sepBalance = Core.getSepBalance(),
            octBalance = Core.getOctBalance(),
            novBalance = Core.getNovBalance(),
            decBalance = Core.getDecBalance();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        this.januaryBT =(Button)this.findViewById(R.id.janBT);
        this.februaryBT =(Button)this.findViewById(R.id.febBT);
        this.marchBT =(Button)this.findViewById(R.id.marBT);
        this.aprilBT =(Button)this.findViewById(R.id.aprBT);
        this.mayBT =(Button)this.findViewById(R.id.mayBT);
        this.juneBT =(Button)this.findViewById(R.id.junBT);
        this.julyBT =(Button)this.findViewById(R.id.julBT);
        this.augustBT =(Button)this.findViewById(R.id.augBT);
        this.septemberBT =(Button)this.findViewById(R.id.sepBT);
        this.octoberBT =(Button)this.findViewById(R.id.octBT);
        this.novemberBT =(Button)this.findViewById(R.id.novBT);
        this.decemberBT =(Button)this.findViewById(R.id.decBT);

        this.janBTString = this.januaryBT.getText().toString();
        this.febBTString = this.februaryBT.getText().toString();
        this.marBTString = this.marchBT.getText().toString();
        this.aprBTString = this.aprilBT.getText().toString();
        this.mayBTString = this.mayBT.getText().toString();
        this.junBTString = this.juneBT.getText().toString();
        this.julBTString = this.julyBT.getText().toString();
        this.augBTString = this.augustBT.getText().toString();
        this.sepBTString = this.septemberBT.getText().toString();
        this.octBTString = this.octoberBT.getText().toString();
        this.novBTString = this.novemberBT.getText().toString();
        this.decBTString = this.decemberBT.getText().toString();
    }

    protected void onStart(Bundle savedInstanceState)
    {
        this.setMonthsTV();
    }

    private void setMonthsTV()
    {
        String month1 = this.janBTString + "     Net Monthly Income: $" + this.janBalance.getText().toString();
        this.januaryBT.setText(month1);

        String month2 = this.febBTString + "     Net Monthly Income: $" + this.febBalance.getText().toString();
        this.februaryBT.setText(month2);

        String month3 = this.marBTString + "     Net Monthly Income: $" + this.marBalance.getText().toString();
        this.marchBT.setText(month3);

        String month4 = this.aprBTString + "     Net Monthly Income: $" + this.aprBalance.getText().toString();
        this.aprilBT.setText(month4);

        String month5 = this.mayBTString + "     Net Monthly Income: $" + this.mayBalance.getText().toString();
        this.mayBT.setText(month5);

        String month6 = this.junBTString + "     Net Monthly Income: $" + this.junBalance.getText().toString();
        this.juneBT.setText(month6);

        String month7 = this.julBTString + "     Net Monthly Income: $" + this.julBalance.getText().toString();
        this.julyBT.setText(month7);

        String month8 = this.augBTString + "     Net Monthly Income: $" + this.augBalance.getText().toString();
        this.augustBT.setText(month8);

        String month9 = this.sepBTString + "     Net Monthly Income: $" + this.sepBalance.getText().toString();
        this.septemberBT.setText(month9);

        String month10 = this.octBTString + "     Net Monthly Income: $" + this.octBalance.getText().toString();
        this.octoberBT.setText(month10);

        String month11 = this.novBTString + "     Net Monthly Income: $" + this.novBalance.getText().toString();
        this.novemberBT.setText(month11);

        String month12 = this.decBTString + "     Net Monthly Income: $" + this.decBalance.getText().toString();
        this.decemberBT.setText(month12);
    }

    public void janButtonClicked(View v)
    {

    }

    public void febButtonClicked(View v)
    {

    }

    public void marButtonClicked(View v)
    {

    }

    public void aprButtonClicked(View v)
    {

    }

    public void mayButtonClicked(View v)
    {

    }

    public void junButtonClicked(View v)
    {

    }

    public void julButtonClicked(View v)
    {

    }

    public void augButtonClicked(View v)
    {

    }

    public void sepButtonClicked(View v)
    {

    }

    public void octButtonClicked(View v)
    {

    }

    public void novButtonClicked(View v)
    {

    }

    public void decButtonClicked(View v)
    {

    }
}//class
