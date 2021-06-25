package bz.data.MainClass.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Bungalow implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomBungalow;
    private String description;
    private String photoName;
    private int currentPrice;
    @ManyToOne
    private Category category;

}
