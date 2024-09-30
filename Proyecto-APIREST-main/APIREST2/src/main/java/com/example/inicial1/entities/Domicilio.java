package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio extends Base{

    @Column(name="calle")
    private String calle;
    @Column(name = "numero")
    private int numero;


    @ManyToOne(optional = false) //optinoal false me indica que siempre que cree un domicilio tiene que tener una localidad
    @JoinColumn(name = "FK_LOCALIDAD")
    private Localidad localidad;
}
