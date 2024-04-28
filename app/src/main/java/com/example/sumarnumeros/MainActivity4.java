package com.example.sumarnumeros;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends MainActivity {
    private EditText numA,numB;
    private TextView salida;
    public Button boton;
    private RadioButton botonbit1;
    private RadioButton botonbit8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //Obtenemos una referencia a los controles de la interfaz gráfica
        numA = (EditText)findViewById(R.id.entrada);
        numB = (EditText)findViewById(R.id.entrada2);
        salida =(TextView)findViewById(R.id.salida);
        boton = (Button) findViewById(R.id.botonnot);
        botonbit1=(RadioButton) findViewById(R.id.b1);
        botonbit8=(RadioButton) findViewById(R.id.b8);

        Toast.makeText(this,"Introduce un valor en la opción A y B",Toast.LENGTH_SHORT).show();
    }
    //Implementamos el evento click del botón
    public int calcular(int numero1, int numero2){
        int s1;
        if((numero1==0 && numero2==0)){
            s1=0;

        }else{
            s1=1;
        }
        return s1;

    }

    //Implementamos el evento click del botón
    public void onClick(View v) {

        if(botonbit1.isChecked()) {
            String valor1 = numA.getText().toString();
            String valor2 = numB.getText().toString();
            if (valor1.length() != 1 || valor2.length() != 1) {
                Toast.makeText(this, "Introduce un valor correcto", Toast.LENGTH_SHORT).show();

            } else {


                int numero1 = Integer.parseInt(valor1);
                int numero2 = Integer.parseInt(valor2);
                int s = calcular(numero1, numero2);
                String resultado = String.valueOf(s);
                salida.setText(resultado);

            }
        }else {
            StringBuilder res = new StringBuilder();
            String valor1 = numA.getText().toString();
            String valor2 = numB.getText().toString();
            if (valor1.length() != 8 || valor2.length() != 8) {
                Toast.makeText(this, "Introduce un valor correcto", Toast.LENGTH_SHORT).show();

            } else {


                char[] v1 = valor1.toCharArray();
                char[] v2 = valor2.toCharArray();
                for (int i = 0; i < 8; i++) {
                    if (v1[i] == '0' && v2[i] == '0') {
                        res.append("0");
                    } else {
                        res.append("1");
                    }
                }
                salida.setText(res.toString());


            }
        }

    }

    //8bits

    public void clickradiobutton2(View View){
        numA.setText("");
        numB.setText("");
        salida.setText("");
        numA.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        numB.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        salida.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
    }
    public void clickradiobutton1(View View){
        numA.setText("");
        numB.setText("");
        salida.setText("");
        numA.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        numB.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
        salida.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
    }
}