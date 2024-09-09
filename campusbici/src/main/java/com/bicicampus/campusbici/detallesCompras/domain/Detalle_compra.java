package com.bicicampus.campusbici.detallesCompras.domain;
import com.bicicampus.campusbici.compras.domain.Compras;
import com.bicicampus.campusbici.repuesto.domain.Repuesto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalles_compras")
public class Detalle_compra {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column
private int cantidad;
@Column
private double precioUnitario;

@ManyToOne
@JoinColumn(name = "id_compra")
private Compras compra;

@ManyToOne
@JoinColumn(name = "id_repuesto")
private Repuesto repuesto;



}
