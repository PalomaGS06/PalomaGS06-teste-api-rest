package rpnet.testeapirest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rpnet.testeapirest.model.TiposModel;
import rpnet.testeapirest.repository.TiposRepository;



@RestController
public class TiposController {

    private TiposRepository trepository;


    @GetMapping(path = "/api/tipos") 
    public ResponseEntity listartipos(@PathVariable("tipo") String tipo_usuario) {    

    return null;
} 

@PostMapping(path = "/api/tipos/salvar") 
public TiposModel salvar(@RequestBody TiposModel tipo) { 
    return trepository.save(tipo);
}

}
