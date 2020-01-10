package kk.springframework.msscbrewery.web.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import org.hibernate.annotations.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

@Table(name = "beer")
public class BeerEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beerId")
    private Long id;

    @Column(name="beerName")
    private String beerName;

    @Column(name="beerStyle")
    private String beerStyle;

    @Column(name="beerUpc")
    private Long upc;
}
