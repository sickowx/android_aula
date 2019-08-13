package br.edu.unifcv.myapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnCalcular;
    private EditText edtValor;
    private EditText edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        edtValor = findViewById(R.id.edtValor);
        edtResultado = findViewById(R.id.edtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

            }
        });

    }

    public void EventoBotao(View view) {

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalcular);
    }
}
