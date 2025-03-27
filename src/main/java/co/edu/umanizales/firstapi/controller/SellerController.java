package co.edu.umanizales.firstapi.controller;

import co.edu.umanizales.firstapi.model.Location;
import co.edu.umanizales.firstapi.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/seller")
public class SellerController {
//como leer un archivo csv desde java
    @GetMapping
    public Seller getSeller(){
        Location manizales = new Location("17001", "Manizales");
        Location pereira = new Location("66001", "Pereira");

        Seller pepe = new Seller("648264839", "pepe", "perez",  'm', (byte) 43, manizales);
        Seller papa = new Seller("105486303", "papa", "ramirez",  'm', (byte) 8, manizales);
        Seller isabel = new Seller("390202000", "isabel", "martinez",  'f', (byte) 20, pereira);
        Seller daniel = new Seller("648264839", "daniel", "santana",  'm', (byte) 12, manizales);
        Seller jairo = new Seller("648264839", "jairo", "alvarez",  'm', (byte) 48, manizales);

        return jairo;
    }
}
