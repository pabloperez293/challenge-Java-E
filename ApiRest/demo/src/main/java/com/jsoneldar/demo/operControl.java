package com.jsoneldar.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
    public class operControl{

        @PostMapping("/operacion")
        public double consultarTasa(@RequestBody Operacion operacion, @RequestHeader("Content-Type") String contentType){
// El requestBody indicamos que se espera un objeto JSON indicamos la tarjeta y el importe
        if ( !contentType.equals("application/json")){
            throw new IllegalArgumentException("El encabezado contentType debe ser json");
        }

        return 0.05;

    }
}