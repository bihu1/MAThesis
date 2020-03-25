package pl.bihuniak.objective8p;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipCode;
}