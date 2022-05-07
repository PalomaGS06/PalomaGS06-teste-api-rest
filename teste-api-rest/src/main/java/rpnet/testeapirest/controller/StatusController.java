package rpnet.testeapirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatusController {
    
    @GetMapping(path = "/api/status") // método que é executado quando houver uma request/requisição 
    public String check() {
        return "online";  //estado ONLINE
    }
}
