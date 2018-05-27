package com.example.raul.learnmvp;

public interface AlCuadrado {

    interface View{
        void showResult(String result);
        void showError(String error);
    }

    interface Presenter{
        void showResult(String result);
        void showError(String error);
        void alCuadrado(String data);
    }

    interface Model{
        void alCuadrado(String data);
    }
}
