package com.vero.crudproducto.Repositorio;

import com.vero.crudproducto.Modelo.MProducto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProducto extends MongoRepository<MProducto, String> {
    
}
