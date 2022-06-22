package com.missaoperegrina.service;

import com.missaoperegrina.domain.Voluntario;
import com.missaoperegrina.repositories.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioService {

    public final VoluntarioRepository repository;

    @Autowired
    public VoluntarioService(VoluntarioRepository repository) {
        this.repository = repository;
    }

    public Voluntario salvaVoluntario(Voluntario voluntario) {
        return repository.save(voluntario);
    }

    public List<Voluntario> buscarTodosVoluntarios(){
        return repository.findAll();
    }

}
