package com.utn.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Autor extends Base{


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "biografia", length = 1500)
    private String biografia;

    @Column(name = "apellido")
    private String apellido;

}
