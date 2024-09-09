package com.bicicampus.campusbici.Modelo.application;

import java.util.List;
import java.util.Optional;

import com.bicicampus.campusbici.Modelo.domain.Modelo;

public interface ModeloInt {

 Modelo crearModelo(Modelo modelo); 
 List<Modelo> getAllModelos();
 void deleteModelo(Long id);

}
