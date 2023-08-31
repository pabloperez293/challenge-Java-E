package procesarOperaciones;

import java.time.LocalDate;

// puntos informes, validaciones e indentificar

public class tarjetaCred {
    
    private String PAN;
    private String titular;
    private String fechaVencimiento;
    private String tipo;
    private double saldo;


    public tarjetaCred(String PAN, String titular, LocalDate fechaVencimiento, double saldo , String tipo ){
        this.titular = titular;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
        this.PAN = PAN;
        this.tipo = tipo;
    }  

    @Override 
    public boolean equals(Object o) {

        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        boolean cond4 = false;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

         tarjetaCred tarjeta = (tarjetaCred) o;

         cond1 = this.titular.equals(tarjeta.titular);
         cond2 = this.fechaVencimiento.equals(tarjeta.fechaVencimiento);
         cond3 = this.PAN.equals(tarjeta.PAN); 

        if (cond1 && cond2 && cond3 ) {
     
            System.out.println("funciona");
            return true;

        }else{
            System.out.println("no funciona");
            return false;
        }

tengo que efectuar un pago
    
    // Para obtener la informacion de la tarjet
    public String obtenerInfoTarjeta() {
        return "Numero de tarjeta: " + PAN + " nombre: " + titular + " Fecha de vencimiento " +  fechaVencimiento + " saldo "+ saldo;
    }
    
    public boolean distinto(tarjetaCred oTarjetaCred){
        if ( !this.tipo.equals(oTarjetaCred.tipo)) {
            return true;
        }

        if ( !this.PAN.equals(oTarjetaCred.PAN)) {
            return true;
        }

        return false;
    }

    // probamos si el metodo funciona correctamente 
    
}
