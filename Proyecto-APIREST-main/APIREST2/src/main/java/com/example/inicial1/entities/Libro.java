package com.example.inicial1.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@Table(name = "libro")
@Audited
public class Libro extends Base {

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name="genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;


    @ManyToMany(cascade = CascadeType.REFRESH) //al momento de persistir un libro se tenga actualizado los autores

    private List<Autor> autores = new ArrayList<>();



}
