package procesarOperaciones;

import java.time.LocalDate;

public class sistemasBancario {
    // Validaciones 
      
    public void efectuarPago( tarjeta tarjetas , double monto ) {

        // Valida para operar            
            double limitConsum = 1000;
        // LocalDate fechaActual = LocalDate.of(2023, 8, 31);

    // Verificamos si la operacion es valida 
            if( monto < limitConsum ) {
                System.out.println("La operacion es valida");
            }else{
    // Colocar una excepcion trycatch
                System.out.println("La operacion no es valida");
            }

    // Verificar si la tarjeTa es valida para operara

            LocalDate fechaActual = LocalDate.now();
            if( tarjetas.getFechaVencimiento().isAfter(fechaActual)){
                System.out.println("la tarjeta es valida para operar");
            } else{
                // Colocar una excepcion trycatch
                System.out.println("la tarjeta no es valida para operar");
            }

            // procesarPago();
        }


        public void procesarPago(tarjeta tarjetas,double monto){
            

        }

    }

