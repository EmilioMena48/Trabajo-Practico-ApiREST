package com.utn.demo.repositories;

import com.utn.demo.entities.Localidad;
import com.utn.demo.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
}
