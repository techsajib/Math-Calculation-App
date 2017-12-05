package com.techsajib.mathcalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText et1,et2;
         Button addButton, subButton, mulButton, divButton, resetButton;
            TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        addButton = (Button) findViewById(R.id.addButton);
        subButton = (Button) findViewById(R.id.subButton);
        mulButton = (Button) findViewById(R.id.mulButton);
        divButton = (Button) findViewById(R.id.divButton);
        resetButton = (Button) findViewById(R.id.reset);
        result = (TextView) findViewById(R.id.textResult);

            // for adding operation
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer data1 = Integer.parseInt(et1.getText().toString());
                Integer data2 = Integer.parseInt(et2.getText().toString());
                Integer res = data1 + data2;
                result.setText("Your Result is: " + res);
            }
        });

        // for subtraction operation
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer data1 = Integer.parseInt(et1.getText().toString());
                Integer data2 = Integer.parseInt(et2.getText().toString());
                Integer res = data1 - data2;
                result.setText("Your Result is: " + res);
            }
        });

        // for multi operation
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer data1 = Integer.parseInt(et1.getText().toString());
                Integer data2 = Integer.parseInt(et2.getText().toString());
                Integer res = data1 * data2;
                result.setText("Your Result is: " + res);
            }
        });

        // for division operation
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer data1 = Integer.parseInt(et1.getText().toString());
                Integer data2 = Integer.parseInt(et2.getText().toString());
                Integer res = data1 / data2;
                result.setText("Your Result is: " + res);
            }
        });

            // for reset operation

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                result.setText("");
            }
        });
    }
}
