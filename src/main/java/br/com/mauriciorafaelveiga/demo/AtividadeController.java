package br.com.mauriciorafaelveiga.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeController {

    @GetMapping("/atividade")
    public String atividade() {
        return "Mauricio Rafael Veiga";
    }
}
