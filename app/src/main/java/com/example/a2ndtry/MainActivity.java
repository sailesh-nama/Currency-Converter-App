package com.example.a2ndtry;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner s1,s2;
    EditText et;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.txtamount);
        s1 = findViewById(R.id.spfrom);
        s2 = findViewById(R.id.spto);
        b  = findViewById(R.id.btn1);
        tv = findViewById(R.id.tv9);

        tv.setEnabled(false);
        tv.setVisibility(View.GONE);

        et.addTextChangedListener(decide);


        String[] from = {"Australian Dollar","Bangladeshi Taka","Canadian Dollar","Euro","Indian Rupee","Indonesia Rupiah","Japanese Yen","Malaysian Ringgit","Pakistani Rupee","Saudi Riyal","Singapore Dollar","Sri Lankan Rupee","Swiss Franc","UAE Dirham","United States Dollar"};
        ArrayAdapter ad1 = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,from);
        s1.setAdapter(ad1);

        String[] to = {"Australian Dollar","Bangladeshi Taka","Canadian Dollar","Euro","Indian Rupee","Indonesia Rupiah","Japanese Yen","Malaysian Ringgit","Pakistani Rupee","Saudi Riyal","Singapore Dollar","Sri Lankan Rupee","Swiss Franc","UAE Dirham","United States Dollar"};
        ArrayAdapter ad2 = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,to);
        s2.setAdapter(ad2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                double answer;
                double amount = Double.parseDouble(et.getText().toString());
                String zerocheck = et.getText().toString().trim();

                if(zerocheck.equals("0"))
                {
                    Toast.makeText(MainActivity.this, "Really? you need to convert ZERO "+("\ud83d\ude29")+("\ud83d\ude29"), Toast.LENGTH_SHORT).show();
                }

                else if(zerocheck.equals("0.0"))
                {
                    Toast.makeText(MainActivity.this, "Really? you need to convert ZERO "+("\ud83d\ude29")+("\ud83d\ude29"), Toast.LENGTH_SHORT).show();
                }

                else if(zerocheck.equals("0.00"))
                {
                    Toast.makeText(MainActivity.this, "Really? you need to convert ZERO "+("\ud83d\ude29")+("\ud83d\ude29"), Toast.LENGTH_SHORT).show();
                }

                else {

                    if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Australian Dollar"))
                    {
                        Toast.makeText(MainActivity.this, "Take some effort to change the default options please! " + ("\ud83d\ude12"), Toast.LENGTH_SHORT).show();
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Bangladeshi Taka")) {
                        answer = amount * 54.13;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Canadian Dollar")) {
                        answer = amount * 0.90;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Euro")) {
                        answer = amount * 0.59;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Indian Rupee")) {
                        answer = amount * 48.62;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Indonesia Rupiah")) {
                        answer = amount * 9816.34;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Japanese Yen")) {
                        answer = amount * 68.54;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Malaysian Ringgit")) {
                        answer = amount * 2.78;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    }

                    else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Pakistani Rupee")) {
                        answer = amount * 101.91;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Saudi Riyal")) {
                        answer = amount * 2.39;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Singapore Dollar")) {
                        answer = amount * 0.91;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Sri Lankan Rupee")) {
                        answer = amount * 122.97;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("Swiss Franc")) {
                        answer = amount * 0.62;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("UAE Dirham")) {
                        answer = amount * 2.34;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Australian Dollar") && s2.getSelectedItem().toString().equals("United States Dollar")) {
                        answer = amount * 0.64;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Australian Dollar")) {
                        answer = amount * 0.018;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Bangladeshi Taka")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as BDT it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Canadian Dollar")) {
                        answer = amount * 0.017;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Euro")) {
                        answer = amount * 0.011;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Indian Rupee")) {
                        answer = amount * 0.90;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Indonesia Rupiah")) {
                        answer = amount * 184.02;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Japanese Yen")) {
                        answer = amount * 1.27;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Bangladeshi Taka") && s2.getSelectedItem().toString().equals("Malaysian Ringgit")) {
                        answer = amount * 0.051;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 1.88;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.044;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.017;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 2.27;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.011;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.043;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Bangladeshi Taka") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.012;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 1.11;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 60.31;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as CAD it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.66;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Canadian Dollar") && s2.getSelectedItem().toString().equals("Indian Rupee")) {
                        answer = amount * 54.14;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Canadian Dollar") && s2.getSelectedItem().toString().equals("Indonesia Rupiah")) {
                        answer = amount * 11041.77;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Canadian Dollar") && s2.getSelectedItem().toString().equals("Japanese Yen")) {
                        answer = amount * 76.28;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().toString().equals("Canadian Dollar") && s2.getSelectedItem().toString().equals("Malaysian Ringgit")) {
                        answer = amount * 3.09;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 114.23;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 2.67;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 1.01;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 136.95;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.69;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 2.61;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Canadian Dollar") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.71;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 1.69;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 91.99;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 1.53;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Euro")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as EUR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 82.57;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 16842.45;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 116.31;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 4.72;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 174.23;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 4.07;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 1.01;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 1.54;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 1.05;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 3.98;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Euro") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 1.08;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.021;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 1.11;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.018;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.012;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Indian Rupee")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as INR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_SHORT).show();
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 203.97;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 1.41;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 0.057;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 2.11;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.049;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.019;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 2.53;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.013;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.048;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indian Rupee") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.013;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.00010;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 0.0055;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.000091;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.000059;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 0.0049;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as IDR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 0.0069;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 0.00028;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 0.010;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.00024;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.000091;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 0.012;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.000063;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.00024;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Indonesia Rupiah") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.000064;
                        answer = (double) (Math.round(answer * 100000)) / 100000;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.015;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 0.79;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.013;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.0086;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 0.71;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 144.75;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Japanese Yen")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as JPY it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 0.041;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 1.50;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.035;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.013;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 1.80;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.0091;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.034;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Japanese Yen") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.0093;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.36;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 19.50;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.32;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.21;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 17.50;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 3569.93;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 24.73;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as MYR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 36.93;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.86;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.33;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 44.28;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.22;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.84;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Malaysian Ringgit") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.23;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.0098;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 0.53;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.0088;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.0058;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 0.48;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 96.31;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 0.67;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 0.027;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as PKR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.024;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.0089;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 1.21;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.0061;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.023;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Pakistani Rupee") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.0063;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.42;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 22.60;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.38;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.25;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 20.29;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 4095.47;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 28.58;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 1.16;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 48.82;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as SAR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.38;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 51.33;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.26;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.98;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Saudi Riyal") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.27;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 1.10;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 59.66;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.99;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.65;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 53.54;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 10808;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 75.47;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 3.06;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 113.00;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 2.64;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as SGD it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 135.48;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.68;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 2.58;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Singapore Dollar") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.70;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.0081;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 0.44;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.0073;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.0048;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 0.40;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 79.78;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 0.56;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 0.023;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 0.83;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 0.019;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.0074;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as LKR it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.0050;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 0.019;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Sri Lankan Rupee") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.0052;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 1.61;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 87.34;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 1.45;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.95;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 78.38;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 15823.39;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 110.42;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 4.48;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 165.43;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 3.86;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 1.46;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 198.34;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("Swiss Franc")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as CHF it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 3.77;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("Swiss Franc") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 1.03;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 0.43;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 23.14;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 0.38;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.25;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 20.77;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 4192.59;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 29.26;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 1.19;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 43.83;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 1.02;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 0.39;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 52.55;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.26;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("UAE Dirham")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as UAD it's obviously same " + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (s1.getSelectedItem().equals("UAE Dirham") && s2.getSelectedItem().equals("United States Dollar")) {
                        answer = amount * 0.27;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" USD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Australian Dollar")) {
                        answer = amount * 1.57;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" AUD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Bangladeshi Taka")) {
                        answer = amount * 85.00;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" BDT");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Canadian Dollar")) {
                        answer = amount * 1.41;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Euro")) {
                        answer = amount * 0.92;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" EUR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Indian Rupee")) {
                        answer = amount * 76.28;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" INR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Indonesia Rupiah")) {
                        answer = amount * 15400.00;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" IDR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Japanese Yen")) {
                        answer = amount * 107.47;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" JPY");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Malaysian Ringgit")) {
                        answer = amount * 4.36;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" MYR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Pakistani Rupee")) {
                        answer = amount * 161.00;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" PKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Saudi Riyal")) {
                        answer = amount * 3.76;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SAR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Singapore Dollar")) {
                        answer = amount * 1.42;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" SGD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Sri Lankan Rupee")) {
                        answer = amount * 193.03;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" LKR");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("Swiss Franc")) {
                        answer = amount * 0.97;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" CHF");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("UAE Dirham")) {
                        answer = amount * 3.67;
                        answer = (double) (Math.round(answer * 100)) / 100;
                        String finalresult = Double.toString(answer).concat(" UAD");
                        tv.setText(finalresult);
                        tv.setVisibility(View.VISIBLE);
                        tv.setEnabled(true);
                    } else if (s1.getSelectedItem().equals("United States Dollar") && s2.getSelectedItem().equals("United States Dollar")) {
                        Toast.makeText(MainActivity.this, "WTF you selected both as USD its obviously same" + ("\ud83d\ude11"), Toast.LENGTH_LONG).show();
                    } else if (et.getText() == null) {
                        Toast.makeText(MainActivity.this, "OOPS! app isn't totally build yet " + ("\ud83d\ude05"), Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
    private TextWatcher decide = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            String txtamountinput = et.getText().toString().trim();
            b.setEnabled(!txtamountinput.isEmpty()&& !txtamountinput.equals("."));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
