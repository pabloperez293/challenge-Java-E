package procesarOperaciones;

import java.time.LocalDate;

public class ejercicio {

    public static void main(String[] args){
        // Crear objeto en sistema bancario
        sistemasBancario  miSistema =  new sistemasBancario();

        // Por las dudas la dejamos como parametro
        // LocalDate fechaActual = LocalDate.of(2023, 8, 31);

        // Sistemas bancarios
        LocalDate fecha  =  LocalDate.of(2023, 9, 23);

        miSistema.efectuarPago(fecha , "1321312321654", 800);


    
    }
}
