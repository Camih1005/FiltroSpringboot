package com.bicicampus.campusbici.pais.domain;

import com.bicicampus.campusbici.ciudad.domain.Ciudad;

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


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "paises")
public class Pais {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@NotBlank
@Column
private String nombre;

}
