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

    public static void main(String[] args){
        tarjetaCred tarjeta1 = new tarjetaCred("visa", "1231654653");
        tarjetaCred tarjeta2 = new tarjetaCred("nara", "1231654653");
        tarjetaCred tarjeta3 = new tarjetaCred("amex", "1231654653");

        if ( tarjeta1.distinto(tarjeta2)) {
            System.out.println("La tarjea 1 es distina a la tarjeta 2");
        }else{
            System.out.println("La tarjea 1 es igual a la tarjeta  2");
        }

        if ( tarjeta1.distinto(tarjeta3)) {
              System.out.println("La tarjea 1 es distina a la tarjeta 3");
        }else{
            System.out.println("La tarjea 1 es igual a la tarjeta  ");
        }

    }
     // Probar si esta bien el metodo
    // public static void main(String[] args){
    //     tarjetaCred mitarjeta = new tarjetaCred("123123123123", "PAblo", "06/05", 1000);
    //     String info = mitarjeta.obtenerInfoTarjeta();
    //     System.out.println(info);
    // } funciona (Y)
    
}
