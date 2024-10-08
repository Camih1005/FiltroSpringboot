package com.bicicampus.campusbici.bicicletas.domain;

import com.bicicampus.campusbici.Modelo.domain.Modelo;
import com.bicicampus.campusbici.marca.domain.Marca;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bicicletas")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "modelo")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca")
    private Marca marca;
    @NotBlank
    @Column
    private double precio;
    @NotBlank
    @Column
    private int stock;
}
