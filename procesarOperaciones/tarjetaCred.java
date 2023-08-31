package procesarOperaciones;

import java.time.LocalDate;

// puntos informes, validaciones e indentificar

public class tarjetaCred {
    
    private String marca;
    private String PAN;
    private String cardholder;
    private LocalDate fechaVencimiento;


    public tarjetaCred(String marca, String PAN, LocalDate fechaVencimiento, String cardholder ){
        // Constructor
        this.marca = marca;
        this.PAN = PAN;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;      
    }  
// Getters
    public String getMarca() {
        return marca;
    }

    public String getPan() {
        return PAN;
    }

    public String getCardholder() {
        return cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override 
    public boolean equals(Object o) {

        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        boolean cond4 = false;


         tarjetaCred tarjeta = (tarjetaCred) o;

        //  comparando
         cond1 = this.cardholder.equals(tarjeta.cardholder);
         cond2 = this.fechaVencimiento.equals(tarjeta.fechaVencimiento);
         cond3 = this.PAN.equals(tarjeta.PAN); 
         cond4 = this.marca.equals(tarjeta.marca); 


        if (cond1 && cond2 && cond3 && cond4) {     
            System.out.println("funciona");
            return true;

        }else{
            System.out.println("no funciona");
            return false;
        }
    }

 // Para obtener la informacion de la tarjet
    @Override
        public String toString() {
            // return por String todos los datos de la tarjeta
            return "Numero de tarjeta: " + PAN + " nombre: " + cardholder + " Fecha de vencimiento " +  fechaVencimiento + " marca "+ marca;
        }   
            
}
