package procesarOperaciones;

import java.time.LocalDate;

public class ejercicio {

    public static void main(String[] args){
        // Crear objeto en sistema bancario
        sistemasBancario  miSistema =  new sistemasBancario();       

        // Sistemas bancarios
        LocalDate fecha  =  LocalDate.of(2023, 9, 23);

        miSistema.efectuarPago(fecha , "1321312321654", 800);

        // informacion de la tarjeta
        tarjetaCred tarjeta1 = new tarjetaCred("visa" , "32165468412", fecha , "Juancito perez");

        System.out.println(tarjeta1.toString());



    
    }
}
