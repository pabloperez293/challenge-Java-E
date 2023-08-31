package procesarOperaciones;

import java.time.LocalDate;

public class tarjetaVisa extends tarjeta {

      public tarjetaVisa(String PAN, LocalDate fechaVencimiento, String cardholder) {
            super("Visa", PAN, fechaVencimiento, cardholder);
            
        }

        @Override
        // Trabajamos con la clase del hijo
        public double obtenerTasa(LocalDate fecha ){

            return fecha.getYear() / fecha.getMonthValue();

        }
}
