package com.utn.demo.services;

import com.utn.demo.entities.Localidad;
import com.utn.demo.entities.Persona;
import com.utn.demo.repositories.BaseRepository;
import com.utn.demo.repositories.LocalidadRepository;
import com.utn.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public abstract class LocaliadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocaliadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocaliadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
