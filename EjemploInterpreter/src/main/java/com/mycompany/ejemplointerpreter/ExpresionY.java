package com.mycompany.ejemplointerpreter;

public class ExpresionY implements Expresion {
	 
   private Expresion expresion1 = null;
   private Expresion expresion2 = null;

   public ExpresionY(Expresion expresion1, Expresion expresion2) { 
      this.expresion1 = expresion1;
      this.expresion2 = expresion2;
   }

   @Override
   public boolean interpretar(String contexto) {		
      return expresion1.interpretar(contexto) && expresion2.interpretar(contexto);
   }
}