package com.example.raul.learnmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View{

    private TextView tvAlCuadradox;
    private EditText etAlCuadrado;
    private AlCuadrado.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAlCuadradox = findViewById(R.id.tvAlCuadrado);
        etAlCuadrado = findViewById(R.id.etAlCuadrado);
        presenter = new AlCuadradoPresenter(this);

    }

    public void calcular(View view){
        //Invocamos al presentador para este se comunique con el modelo
        presenter.alCuadrado(etAlCuadrado.getText().toString());

    }

    @Override
    public void showResult(String result) {
        tvAlCuadradox.setText(result);
    }

    @Override
    public void showError(String error) {
        tvAlCuadradox.setText(error);
    }
}
