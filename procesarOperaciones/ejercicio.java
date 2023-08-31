package procesarOperaciones;

import java.time.LocalDate;

public class ejercicio {

    public static void main(String[] args){
        // Crear objeto en sistema bancario
        sistemasBancario  miSistema =  new sistemasBancario();       
        System.out.println("----------------------------");


        // Sistemas bancarios
        LocalDate fecha  =  LocalDate.of(2023, 9, 23);
        // test 1: Efectuo pago < 1000
        miSistema.efectuarPago(fecha , "1321312321654", 800);
        System.out.println("----------------------------");

        // test 2: Efectuo pago > 1000
        miSistema.efectuarPago(fecha , "1321312321654", 1500);
        System.out.println("----------------------------");

        // test 3: creacion de tarjetas y impresion de datos

        // informacion de la tarjeta
        tarjeta tarjeta1 = new tarjeta("visa" , "32165468412", fecha , "Juancito perez");        
        System.out.println(tarjeta1.toString());


        tarjeta tarjeta2 = new tarjeta("amex" , "23165165323", fecha , "Hernan perez");        
        System.out.println(tarjeta2.toString());
        System.out.println("----------------------------");

        // test 4: Equal de tarjetas con tarjetas diferentes
        System.out.println("Comparacion de tarjeta 1 y tarjeta 2 : " + tarjeta1.equals(tarjeta2) );

        // test 5: Equal de tarjetas con tarjetas diferentes
        System.out.println("Comparacion de tarjeta 2 y tarjeta 2 : " + tarjeta2.equals(tarjeta2) );

        // test 6: constructores de la tarjeta hijos "visa, nara , amex"

        tarjetaVisa tarjeta3 = new tarjetaVisa( "4408 7284 1149 1158", fecha , "Diego perez");      
        
        tarjetaAmex tarjeta4 = new tarjetaAmex( "3421 9798 2125 321", fecha , "Roberto perez");  

        tarjetaNara tarjeta5 = new tarjetaNara( "98751321335", fecha , "Franco perez");  


    
    }
}
