package procesarOperaciones;

import java.time.LocalDate;

public class sistemasBancario {
    // Validaciones 
    public static void main(String[] args){
        double montOper = 800;
        double limitConsum = 1000;
        LocalDate fechaVencimiento = LocalDate.of(2023, 8, 30);


// Verificamos si la operacion es valida 
        if( montOper < limitConsum ) {
            System.out.println("La operacion es valida");
        }else{
            System.out.println("La operacion no es valida");
        }

// Verificar si la tarjea es valida para operara
    }
}
