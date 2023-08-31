package procesarOperaciones;

import java.time.LocalDate;

public class tarjetaNara extends tarjeta{

              public tarjetaNara( String PAN, LocalDate fechaVencimiento, String cardholder) {
            super("Nara", PAN, fechaVencimiento, cardholder);
            
        }
        @Override
        // Trabajamos con la clase del hijo
        public double obtenerTasa(LocalDate fecha ){

            return fecha.getDayOfMonth() * 0.5;

        }
    
}
