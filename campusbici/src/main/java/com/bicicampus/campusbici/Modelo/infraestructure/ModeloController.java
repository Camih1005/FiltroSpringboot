package com.bicicampus.campusbici.Modelo.infraestructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bicicampus.campusbici.Modelo.domain.Modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/modelos")
public class ModeloController {

     @Autowired
     private ModeloService modeloService;

@PostMapping("/post")
public Modelo postMethodName(@RequestBody Modelo modelo) {
  
    
    return modeloService.crearModelo(modelo);
}

@GetMapping()
public List<Modelo> getModelos() {
    return modeloService.getAllModelos();
}

@DeleteMapping("/eliminar/{id}")
public String deleteModelo(@PathVariable Long id){
    modeloService.deleteModelo(id);
    String mensaje = "Eliminado el id numero" + id;
    return mensaje;
}



}
