package procesarOperaciones;

import java.time.LocalDate;

public class sistemasBancario {
    // Validaciones 
      
    public static void efectuarPago(String fechaVencimiento,String PAM  ) {

        // Valida para operar            
    
            double montOper = 800;
            double limitConsum = 1000;
            LocalDate fechaVencimiento = LocalDate.of(2023, 8, 31);


    // Verificamos si la operacion es valida 
            if( montOper < limitConsum ) {
                System.out.println("La operacion es valida");
            }else{
                System.out.println("La operacion no es valida");
            }

    // Verificar si la tarjea es valida para operara

            LocalDate fechaActual = LocalDate.now();
            if( fechaVencimiento.isAfter(fechaActual)){
                System.out.println("la tarjeta es valida para operar");
            } else{
                System.out.println("la tarjeta no es valida para operar");
            }
        }
    }

