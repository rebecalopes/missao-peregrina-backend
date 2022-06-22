package com.missaoperegrina.service;

import com.missaoperegrina.domain.Voluntario;
import com.missaoperegrina.dto.VoluntarioDTO;
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

    public Voluntario fromDTO (VoluntarioDTO voluntarioDTO){
        Voluntario voluntario = new Voluntario (null, voluntarioDTO.getNome(), voluntarioDTO.getNascimento(), voluntarioDTO.getEmail(), voluntarioDTO.getEndereco(), voluntarioDTO.getTelefone(), voluntarioDTO.getEscolaridade(), voluntarioDTO.getVoluntariadoAnterior());
        return voluntario;
    }

}
