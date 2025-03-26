package co.edu.umanizales.firstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sale")
public class SaleController {
    
    @GetMapping
    public String getSale(){
        return "Venta";
    }
}
//controlar el momento en el que un atributo o un objto o un atributo toma o cambia de valor