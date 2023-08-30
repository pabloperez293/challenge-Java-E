package com.jsoneldar.demo;

public class Operacion{
     private String marcaTarjeta;
     private double importe;
     private double tasa;


   //   Constructor
   public Operacion(String marcaTarjeta, double importe){
      this.marcaTarjeta = marcaTarjeta;
      this.importe = importe;
      this.tasa = calcTasa(marcaTarjeta, importe);
   }


     public String getMarcaTarjeta(){
        return marcaTarjeta;
     }
     public void setMarcaTarjeta(String marcaTarjeta){
        this.marcaTarjeta = marcaTarjeta;
     }

     public double getImporte(){
        return importe;
     }
     public void setImporte(double importe) {
        this.importe = importe;
    }
    public double getTasa(){
      return tasa;
    }
    public void setTasa(double tasa) {
      this.tasa = tasa;
    }

   //  Metodo 

   private double calcTasa(String marcaTarjeta , double importe){

      return 0.05;
   }

}