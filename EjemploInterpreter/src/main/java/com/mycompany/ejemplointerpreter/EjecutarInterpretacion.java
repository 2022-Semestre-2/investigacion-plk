package com.mycompany.ejemplointerpreter;

public class EjecutarInterpretacion {

   //Rule: Robert and John are male
   public static Expresion verificarPuedeManejar(){
      Expresion carro = new ExpresionFinal("carro");
      Expresion licencia = new ExpresionFinal("licencia");
      return new ExpresionY(carro, licencia);		
   }

   //Rule: Julie is a married women
   public static Expresion verificarTieneTransporte(){
      Expresion carro = new ExpresionFinal("carro");
      Expresion moto = new ExpresionFinal("moto");
      return new ExpresionO(carro, moto);		
   }

   public static void main(String[] args) {
      Expresion puedeManejar = verificarPuedeManejar();
      Expresion tieneTransporte = verificarTieneTransporte();

      System.out.println("Puede manejar?" + puedeManejar.interpretar("carro y licencia"));
      System.out.println("Tiene transporte?" + tieneTransporte.interpretar("carro"));
   }
}