package rpnet.testeapirest.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rpnet.testeapirest.model.UsuarioModel;
import rpnet.testeapirest.repository.UsuarioRepository;

@RestController
public class UsuarioController {   

    // criando as primeiras consultas

private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{tipo}") //GET do BD.
    public ResponseEntity listar(@PathVariable("tipo") Integer tipo) {    // @PathVariable para sicronizar o tipo com o caminho "tipo"
            return  repository.findById(tipo)
                    .map(record -> ResponseEntity.ok().body(record)) //chama o metodo map para retornar a requesição e registrar.
                    .orElse(ResponseEntity.notFound().build());

    } 
    
    @PostMapping(path = "/api/usuario/salvar") //POST do BD.
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario, tipo, status) { //dados dos usuarios serão enviados no corpo da requisição (RequestBody)
            return repository.save(usuario);
            return repository.save(tipo);
            return repository.save(status);
    }

    @DeleteMapping(path = "/api/usuario/deletar") //DELETE do BD.
    public UsuarioModel deletar(@PathVariable UsuarioModel nome) { //exclui um usuario)
            return repository.delete(nome);

    //         @DeleteMapping("/{id}")
    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // public void deleteById(@PathVariable UsuarioModel nome) throws CadastroNotFoundException {
    //     repository.delete(nome); }
    }
}
