package com.utn.demo.services;

import com.utn.demo.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(ID Id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID Id, E entity) throws Exception;
    public boolean delete(ID Id) throws Exception;
}
