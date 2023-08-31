package procesarOperaciones;

import java.time.LocalDate;

public class tarjetaAmex extends tarjeta{

          public tarjetaAmex( String PAN, LocalDate fechaVencimiento, String cardholder) {
            super("Amex", PAN, fechaVencimiento, cardholder);
            
        }
        @Override
        // Trabajamos con la clase del hijo
        public double obtenerTasa(LocalDate fecha ){

            return fecha.getMonthValue() * 0.1;

        }
}
