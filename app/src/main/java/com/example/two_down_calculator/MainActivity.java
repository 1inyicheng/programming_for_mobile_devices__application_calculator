package com.example.two_down_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void zero(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("0");
    }
    public void one(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("1");
    }
    public void two(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("2");
    }
    public void three(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("3");
    }
    public void four(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("4");
    }
    public void five(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("5");
    }
    public void six(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("6");
    }
    public void seven(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("7");
    }
    public void eight(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("8");
    }
    public void nine(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("9");
    }
    public void clear(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.setText("");
    }
    public void back(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        String temp_result = result.getText().toString();
        if(temp_result.length()>0)
            temp_result = temp_result.substring(0,temp_result.length()-1);
        result.setText(temp_result);
    }
    public void plus(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("+");
    }
    public void minus(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("-");
    }
    public void multiply(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("*");
    }
    public void divide(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        result.append("/");
    }
    public void point(View view)
    {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        String temp_result = result.getText().toString();
        result.append(".");
    }
    public void equal(View view) {
        TextView result = (TextView) findViewById(R.id.resultTextView);
        String temp_result = result.getText().toString();
        if(temp_result.contains("+"))
        {
            String[] part = temp_result.split("\\+");
            result.setText(Double.toString(Double.parseDouble(part[0])+Double.parseDouble(part[1])));
        }
        else if(temp_result.contains("-"))
        {
            String[] part = temp_result.split("-");
            result.setText(Double.toString(Double.parseDouble(part[0])-Double.parseDouble(part[1])));
        }
        else if(temp_result.contains("*"))
        {
            String[] part = temp_result.split("\\*");
            result.setText(Double.toString(Double.parseDouble(part[0])*Double.parseDouble(part[1])));
        }
        else if(temp_result.contains("/"))
        {
            String[] part = temp_result.split("/");
            result.setText(Double.toString(Double.parseDouble(part[0])/Double.parseDouble(part[1])));
        }
    }

}