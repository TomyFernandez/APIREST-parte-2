package com.example.inicial1.entities;


import java.util.ArrayList;
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
@Builder
@Table(name = "autor")
@Audited
public class Autor extends Base{

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia", length = 1500)
    private String biografia;
    @ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable (
            name = "autor_Libro",
            joinColumns = @JoinColumn(name = "autorId"),
                    inverseJoinColumns = @JoinColumn (name = "libroID")
    )
            @Builder.Default
            private List<Libro> libros = new ArrayList<>();
}
