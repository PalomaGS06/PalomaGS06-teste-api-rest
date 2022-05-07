package rpnet.testeapirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

    public class CadastroNotFoundException extends Exception {

        public CadastroNotFoundException(Integer tipo){
              super("Usuario not found with TIPO" + tipo);
        }

    }