package com.example.contadordebilletes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt01, edt02, edt03, edt04, edt05, edt06, edt07 ;
    private TextView tv01, tv02, tv03, tv04, tv05, tv06, tv07, tvr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt01 = (EditText) findViewById (R.id. edt1 );
        edt02 = (EditText) findViewById (R.id. edt2 );
        edt03 = (EditText) findViewById (R.id. edt3 );
        edt04 = (EditText) findViewById (R.id. edt4 );
        edt05 = (EditText) findViewById (R.id. edt90 );
        edt06 = (EditText) findViewById (R.id. edt6 );
        edt07 = (EditText) findViewById (R.id. edt7 );

        tv01 = (TextView) findViewById (R.id. tv01 );
        tv02 = (TextView) findViewById (R.id. tv01 );
        tv03 = (TextView) findViewById (R.id. tv01 );
        tv04 = (TextView) findViewById (R.id. tv01 );
        tv05 = (TextView) findViewById (R.id. tv01 );
        tv06 = (TextView) findViewById (R.id. tv01 );
        tv07 = (TextView) findViewById (R.id. tv01 );
        tvr = (TextView) findViewById (R.id. tvr );

    }
        public void mil (View vmil){

       /* String valor02 = edt01.getText().toString();


        int num2 = Integer.parseInt(valor02);

        int total1 = 1000 * 2;

        String result = String.valueOf(total1);*/
            String valor02 = edt01.getText().toString();
       int num1 = 1000;
       int num2 = Integer.parseInt(valor02);
            int total = num1 * num2;
            String result = String.valueOf(total);
        tv01.setText(result);
        }
}
