package com.example.Hola_Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    
    @GetMapping("/")
    public String mensaje(){
        return "Hola mundo :D";
    }
}
