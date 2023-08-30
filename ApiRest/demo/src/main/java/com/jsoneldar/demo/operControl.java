package com.jsoneldar.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operacion")
    public class operControl{

        @PostMapping("/consulTasa")
            public Operacion consultarTasa(@RequestBody Operacion operacion) {
    // El requestBody indicamos que se espera un objeto JSON indicamos la tarjeta y el importe        
            return operacion;
    }
}