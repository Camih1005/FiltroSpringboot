package com.bicicampus.campusbici.compras.domain;
import java.sql.Date;

import com.bicicampus.campusbici.proveedor.domain.Proveedor;

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


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Compras {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fecha;

    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor;
    
}
