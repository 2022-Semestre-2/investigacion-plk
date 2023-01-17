package com.mycompany.ejemplointerpreter;

public class ExpresionFinal implements Expresion {

    private String datos;

    public ExpresionFinal(String datos) {
        this.datos = datos;
    }

    @Override
    public boolean interpretar(String contexto) {

        if (contexto.contains(datos)) {
            return true;
        }
        return false;
    }
}
