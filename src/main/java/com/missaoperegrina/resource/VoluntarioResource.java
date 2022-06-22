package com.missaoperegrina.resource;

import com.missaoperegrina.domain.Voluntario;
import com.missaoperegrina.service.VoluntarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formulario/voluntario")
public class VoluntarioResource {

    public final VoluntarioService service;

    public VoluntarioResource(VoluntarioService service) {
        this.service = service;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Void> salvaVoluntario(Voluntario voluntario){
        service.salvaVoluntario(voluntario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/buscartodos")
    public ResponseEntity<List<Voluntario>> buscaVoluntarios(){
        List<Voluntario> listaVoluntarios = service.buscarTodosVoluntarios();
        return ResponseEntity.ok().body(listaVoluntarios);
    }
}
