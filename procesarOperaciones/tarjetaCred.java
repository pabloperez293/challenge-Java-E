package procesarOperaciones;

// punto 1 de mostrar info
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




    // Probar si esta bien el metodo
    // public static void main(String[] args){
    //     tarjetaCred mitarjeta = new tarjetaCred("123123123123", "PAblo", "06/05", 1000);
    //     String info = mitarjeta.obtenerInfoTarjeta();
    //     System.out.println(info);
    // } funciona (Y)
    
}
