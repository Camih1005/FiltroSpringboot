package com.bicicampus.campusbici.proveedor.domain;



import com.bicicampus.campusbici.ciudad.domain.Ciudad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NotBlank
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;
    @Column
    private Long contacto;
    @Column
    private String email;
    @Column
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;
}
