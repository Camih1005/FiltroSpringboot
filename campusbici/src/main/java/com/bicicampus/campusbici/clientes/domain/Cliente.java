package com.bicicampus.campusbici.clientes.domain;

import com.bicicampus.campusbici.ciudad.domain.Ciudad;

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


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column 
@NotBlank
private String nombre;
@Column
@NotBlank
private String email;
@Column
@NotBlank
private String telefono;
@Column
@NotBlank
private String password;

@ManyToOne
@JoinColumn(name = "ciudad_id")
private Ciudad ciudad;
}
