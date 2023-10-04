package com.utn.demo.repositories;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.utn.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

}
