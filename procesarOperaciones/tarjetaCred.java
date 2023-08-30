package procesarOperaciones;

public class tarjetaCred {
    
    private String entidadBancaria;
    private String numeros;    
    private double saldo;
    private String marca;
    private String fechaVencimiento;
    private String PAN;

    public tarjetaCred(String entidadBancaria, String numeros, double saldo , String marca, String fechaVencimiento, String PAN){
        this.entidadBancaria = entidadBancaria;
        this.numeros = numeros;
        this.saldo = saldo;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.PAN = PAN;
    }    
    
}
