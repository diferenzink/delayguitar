package com.diferenzink.delayguitar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText BPMEditText;
    Spinner notaSpinner;
    Button calcularButton;
    TextView resultadoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BPMEditText = (EditText) findViewById(R.id.BPMET);
        notaSpinner = (Spinner) findViewById(R.id.notaSpinner);
        calcularButton = (Button) findViewById(R.id.calcularBT);
        resultadoTextView = (TextView) findViewById(R.id.resultadoTV);


        NotasAdapter notasAdapter = new NotasAdapter(this,getNotas());
        notaSpinner.setAdapter(notasAdapter);


        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //float resultado = 6000 / Integer.valueOf(BPMEditText.getText().toString()) * Integer.valueOf(notaEditText.getText().toString());
                float resultado = 375;
                resultadoTextView.setText(String.valueOf(resultado));
            }
        });
    }

    private ArrayList<Nota> getNotas() {
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota("Blanca", "blanca.png", (float) 0.5));
        notas.add(new Nota("Negra", "negra.png", 1));
        notas.add(new Nota("Corchea", "corchea.png", 2));
        return notas;
    }
}
