package co.edu.umanizales.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data

public class Location {
    private String code;
    private String description;

}
