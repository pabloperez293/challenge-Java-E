package com.jsoneldar.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class operControl{

    @PostMapping("/tasa")
    public double consulTasa(@RequestBody Operacion operacion){
// El requestBody indicamos que se espera un objeto JSON

        // Implementacion falsa 
        if( operacion.getMarcaTarjeta().equals("Visa") ){
            return operacion.getImporte() * 0.2;
        }else{
            return operacion.getImporte() * 0.3;
        }
    }
}