package rpnet.testeapirest.repository;

import org.springframework.data.repository.CrudRepository;

import rpnet.testeapirest.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{   //repositório pré preparado para buscas
    
}
