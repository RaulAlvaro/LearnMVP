package com.example.raul.learnmvp;

public class AlCuadradoModel implements AlCuadrado.Model{

    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlCuadradoModel(AlCuadrado.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {
        if (data.equals("")){
            //Invocamos al presenter para que modifique a la vista
            presenter.showError(String.valueOf("Campo Vacio"));
        }
        else{
            //Invocamos al presenter para que modifique a la vista
            resultado = Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
