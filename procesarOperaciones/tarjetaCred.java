package procesarOperaciones;

// punto 1 de mostrar info
public class tarjetaCred {
    
    private String PAN;
    private String titular;
    private String fechaVencimiento;
    private double saldo;
    

    public tarjetaCred(String PAN, String titular, String fechaVencimiento, double saldo ){
        this.titular = titular;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
        this.PAN = PAN;
    }  
    
    // Para obtener la informacion de la tarjet
    public String obtenerInfoTarjeta() {
        return "Numero de tarjeta: " + PAN + " nombre: " + titular + " Fecha de vencimiento " +  fechaVencimiento + " saldo "+ saldo;
    }

    // Probar si esta bien el metodo
    // public static void main(String[] args){
    //     tarjetaCred mitarjeta = new tarjetaCred("123123123123", "PAblo", "06/05", 1000);
    //     String info = mitarjeta.obtenerInfoTarjeta();
    //     System.out.println(info);
    // } funciona (Y)
    
}
