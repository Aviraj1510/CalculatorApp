package com.example.calculatorapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.calculatorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public EditText e1, e2;
    TextView t1;
    int num1, num2;

    public boolean getNumbers(){
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        t1 = findViewById(R.id.result);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();


        if (s1.equals("Please enter value 1") && s2.equals(null))
        {
                String result = "Please enter value 2";
                e2.setText(result);
                return false;
        }
        if (s1.equals(null) && s2.equals("Please enter value 2")){
            String result = "Please enter value 1";
            e1.setText(result);
            return false;

        }
        if (s1.equals("Please enter value 1") && s2.equals("Please enter value 2")){
            return false;
        }
        if ((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals(""))){
            String result = "Please enter value 2";
            e2.setText(result);
            return false;
        }
        if ((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }
        if ((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
            String result1 = "Please enter value 1";
            e1.setText(result1);
            String result2 = "Please enter value 2";
            e2.setText(result2);
            return false;
        }
        else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);

        }

        return true;
    }


    public void doSum(View v){
        if(getNumbers()){
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
        else {
            t1.setText("Error Please Enter Required Values");
        }
    }
    public void clearTextNum1(View v){
        e1.getText().toString();
    }
    public void clearTextNum2(View v){
        e2.getText().toString();
    }

    public void doPow(View v){
        if(getNumbers()){
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
        else{
            t1.setText("Error Please Enter Required Values");
        }
    }

    public void doSub(View v){
        if (getNumbers()){
            int sum = num1- num2;
            t1.setText(Integer.toString(sum));
        }
        else{
            t1.setText("Error Please Enter Required Values");
        }
    }

    public void doMul(View v){
        if(getNumbers()){
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
        else{
            t1.setText("Error Please Enter Required Values");
        }
    }

    public void doDiv(View v){
        if (getNumbers()){
            int sum = num1/num2;
            t1.setText(Integer.toString(sum));
        }
        else{
            t1.setText("Error Please Enter Required Values");
        }
    }

    public void doMod(View v){
        if (getNumbers()){
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
        else{
            t1.setText("Error Please Enter Required Values");
        }
    }

    public void clearAllText(View v){
            t1.setText("");
            e1.setText("");
            e2.setText("");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }
}