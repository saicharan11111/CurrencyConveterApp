package com.charan.currencyconveterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
Button euro,pound,dollar,yen ,bitcoin,ausdollar,candollar,dinar,rubel;
EditText editText;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        euro= findViewById(R.id.Euro);
        pound=findViewById(R.id.Pound);
        dollar=findViewById(R.id.Dollar);
        yen=findViewById(R.id.yen);
        bitcoin=findViewById(R.id.Bitcoin);
        ausdollar=findViewById(R.id.AustrianDollar);
        candollar=findViewById(R.id.CanadianDollar);
        dinar=findViewById(R.id.dinar);
        rubel=findViewById(R.id.rubel);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        //todo code for the euro button
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                    else{
                        double n,k;
                        n=Double.parseDouble(z);
                        //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                        textView.setText(null);
                        Formatter formatter=new Formatter();
                        k=n*0.012;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
        //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                   //textView.setText(""+k)
                    }

            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.010;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
       dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.014;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.0042;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*1.51;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.00;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.018;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*0.017;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo:when the user give the unknow symbols '$' etc... like  the app may crash so
                // to avoid that we are making sure that every inout given by the user comes as a string
                String z=editText.getText().toString();
                //todo:TextUtils is used for the red popup msg when the user gives empty input

                if(TextUtils.isEmpty(z)){
                    //todo: if the user give the empty input then the below statement will be executed
                    editText.setError("Empty user input");
                }
                else{
                    double n,k;
                    n=Double.parseDouble(z);
                    //todo : the below stm will be used to clear all the input given
                    // todo :by the user after the work done
                    textView.setText(null);
                    Formatter formatter=new Formatter();
                    k=n*1.05;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));
                    //todo:    another method for doing  the  above two lines 50 ,51 but not professional way
                    //textView.setText(""+k)
                }

            }
        });

        

    }
}