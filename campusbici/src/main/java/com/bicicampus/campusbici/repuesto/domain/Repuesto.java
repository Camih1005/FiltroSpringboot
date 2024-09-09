package com.bicicampus.campusbici.repuesto.domain;

import com.bicicampus.campusbici.Modelo.domain.Modelo;
import com.bicicampus.campusbici.marca.domain.Marca;
import com.bicicampus.campusbici.proveedor.domain.Proveedor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
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
public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Column
    private String nombre;
    @NotBlank
    @Column
    private String descripcion;
    @NotBlank
    @Column
    private Double precio;
    @NotBlank
    @Column
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_modelo")
    private Modelo modelo;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;

}
