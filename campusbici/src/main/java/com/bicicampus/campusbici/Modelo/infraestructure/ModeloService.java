package com.bicicampus.campusbici.Modelo.infraestructure;

import java.lang.StackWalker.Option;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bicicampus.campusbici.Modelo.application.ModeloInt;
import com.bicicampus.campusbici.Modelo.domain.Modelo;

@Service
public class ModeloService implements ModeloInt{

    @Autowired
    private RepositiryModelo repositoryModelo;

    @Override
    public Modelo crearModelo(Modelo modelo) {
        return repositoryModelo.save(modelo);
    }

    

    @Override
    public List<Modelo> getAllModelos() {
        return repositoryModelo.findAll();
    }



    @Override
    public void deleteModelo(Long id) {

       return;
    }

}
