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

        System.out.println("----------------------------");

        // test 6: constructores de la tarjeta hijos "visa, nara , amex"

        tarjetaVisa tarjeta3 = new tarjetaVisa( "4408 7284 1149 1158", fecha , "Diego perez");   
        System.out.println(tarjeta3.toString());
        
        tarjetaAmex tarjeta4 = new tarjetaAmex( "3421 9798 2125 321", fecha , "Roberto perez");  
        System.out.println(tarjeta4.toString());

        tarjetaNara tarjeta5 = new tarjetaNara( "5895 9798 1158 1149", fecha , "Franco perez");  
        System.out.println(tarjeta5.toString());

        System.out.println("----------------------------");

        // test 7 : sobre escrituras de metodos

        LocalDate fechaActual  =  LocalDate.now();

        System.out.println("Tasa de tarjeta visa "+Double.toString(tarjeta3.obtenerTasa(fechaActual))+ " % ");
        System.out.println("Tasa de tarjeta Amex "+Double.toString(tarjeta4.obtenerTasa(fechaActual))+ " % ");
        System.out.println("Tasa de tarjeta Nara "+Double.toString(tarjeta5.obtenerTasa(fechaActual))+ " % ");

        System.out.println("----------------------------");


        // Test 8 :Nara , Visa y Amex (son clases hijas). En caso de querer extender el sistema se heredaran nuevas clases con la marca de tarjeta correspondiente

    
    }
}
