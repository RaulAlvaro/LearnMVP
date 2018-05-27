package com.example.raul.learnmvp;

public class AlCuadradoPresenter implements AlCuadrado.Presenter{

    private AlCuadrado.View view;
    private AlCuadrado.Model model;

    public AlCuadradoPresenter(AlCuadrado.View view) {
        //Se usa la misma vista ya que este presentador se invoca desde un activity view
        //y ahí se podra modificar el texto a mostrar con los metodos showresult y showerror
        this.view = view;
        model = new AlCuadradoModel(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void showError(String error) {
        if (view != null){
            view.showError(error);
        }
    }

    @Override
    public void alCuadrado(String data) {
        if (view != null){
            //el presentador invoca a un nuevo model y usa le pasa la data al metodo al cuadrado
            model.alCuadrado(data);
        }
    }
}
