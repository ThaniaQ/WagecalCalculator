package com.example.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText HrWorked;
EditText HrRate;
TextView TWage;
Button WWage;
Button DWage;
Button Clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HrWorked = (EditText) findViewById(R.id.HrWorked);
        HrRate = (EditText) findViewById(R.id.HrRate);
        TWage = (TextView) findViewById(R.id.TWage);
        WWage = (Button) findViewById(R.id.WWage);
        DWage = (Button) findViewById(R.id.DWage);
        Clr = (Button) findViewById(R.id.Clr);

        WWage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(HrWorked.getText().toString());
                double input2 = Double.parseDouble(HrRate.getText().toString());
                double sum = input1 * input2;
                sum = sum * 7;

                TWage.setText(String.valueOf(sum));
            }
        });

        Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();

            }
        });

        DWage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(HrWorked.getText().toString());
                double input2 = Double.parseDouble(HrRate.getText().toString());
                double sum = input1 * input2;
                sum =  sum * 1;

                TWage.setText(String.valueOf(sum));
            }
        });

        Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();
            }
        });
    }

    private void clearFields() {
        HrWorked.setText("Enter Hours Worked");
        HrRate.setText("Enter Hourly Rate");
        TWage.setText("Total Wage: ");
    }
}