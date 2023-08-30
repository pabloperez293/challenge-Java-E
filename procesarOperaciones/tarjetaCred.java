package procesarOperaciones;

// puntos informes, validaciones e indentificar

public class tarjetaCred {
    
    private String PAN;
    private String titular;
    private String fechaVencimiento;
    private double saldo;
    private String tipo;
    

    public tarjetaCred(String PAN, String titular, String fechaVencimiento, double saldo , String tipo ){
        this.titular = titular;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
        this.PAN = PAN;
        this.tipo = tipo;
    }  
    
// Se crea otro metodo para validar si son distintas o no las tarjetas
    public tarjetaCred(String string, String string2) {

    }

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
