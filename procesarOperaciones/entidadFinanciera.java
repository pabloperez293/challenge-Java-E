package procesarOperaciones;

import java.time.LocalDate;

public class entidadFinanciera {
    
    public static double entidadFinanciera(String marca, double importe){
        double tasa = 0.0;

    // Obtenemos fecha actual 
        LocalDate fechaActual = LocalDate.now();

    // Calculamos la tasa segun la marca
    if ( marca.equals("Visa")) {
        tasa = fechaActual.getYear() / (double) fechaActual.getMonthValue();
    } else if ( marca.equals("Nara")) {
        tasa = fechaActual.getDayOfMonth() * 0.5 ;
    }else if ( marca.equals("Amex")) {
        tasa = fechaActual.getMonthValue() * 0.1;
    }
    
    // Porcentaje de importe 
    double tasaPorcen = tasa / 100.0;
    double tasaCal = importe * tasaPorcen;

    return tasaCal;
    }

    public static void main(String[] args){
        String marca = "Visa";
        double importe = 1000.0;

        double tasaCal = entidadFinanciera(marca, importe);
        System.out.println("La tasa calculada para la marca es de " + marca + " con un importe de $" + importe + " es: " + tasaCal);
    }
}
