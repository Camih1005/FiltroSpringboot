package com.bicicampus.campusbici.Modelo.infraestructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bicicampus.campusbici.Modelo.domain.Modelo;

@Repository
public interface RepositiryModelo extends JpaRepository<Modelo,Long> {

}
