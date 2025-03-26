package co.edu.umanizales.firstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/seller")
public class SellerController {

    @GetMapping
    public String getSeller(){
        String sellers = "Seller{id=10889283, name='Fernando', lastname='Santana', gender='Male', age=22, location='Manizales'}\n" +
                "Seller{id=10889284, name='Consuelo', lastname='Gallego', gender='Female', age=30, location='Bogotá'}\n" +
                "Seller{id=10889285, name='Juan', lastname='Perez', gender='Male', age=27, location='Medellín'}\n" +
                "Seller{id=10889286, name='Sergio', lastname='Villa', gender='Male', age=35, location='Cali'}\n" +
                "Seller{id=10889287, name='Daniel', lastname='Santana', gender='Male', age=24, location='Barranquilla'}";

        return "Seller";
    }
}
