package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Primer ejercicio
    private EditText number1;
    private EditText number2;
    private TextView result;

    // Segundo ejercicio
    private RadioButton radiobtn1;
    private RadioButton radiobtn2;
    private TextView result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Primer ejercicio
        number1 = (EditText) findViewById(R.id.txtNumeroUno);
        number2 = (EditText) findViewById(R.id.txtNumeroDos);
        result = (TextView) findViewById(R.id.lblResultado);

        //Segundo ejercicio
        radiobtn1 = (RadioButton) findViewById(R.id.rbSumar);
        radiobtn2 = (RadioButton) findViewById(R.id.rbRestar);
        result2 = (TextView) findViewById(R.id.lblResultado2);
    }

    public void sum(View view){
        System.out.println("method sum receive View param");
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();
        Integer n1 = Integer.valueOf(valor1) ;
        Integer n2 = Integer.valueOf(valor2);
        Integer n3 = n1 + n2;
        result.setText( n3.toString() );
    }

    public void operar(View view){
        String valor1 = number1.getText().toString();
        String valor2 = number2.getText().toString();
        Integer n1 = Integer.valueOf(valor1) ;
        Integer n2 = Integer.valueOf(valor2);
        Integer n3 = 0;
        if(radiobtn1.isChecked()){
            n3 = n1 + n2;
        }

        if(radiobtn2.isChecked()){
            n3 = n1 - n2;
        }
        radiobtn2.setChecked(false);
        radiobtn1.setChecked(false);
        result2.setText(n3.toString());
    }
}
