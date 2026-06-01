package br.com.mauriciorafaelveiga.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeController {

    @GetMapping(value = "/atividade", produces = MediaType.TEXT_HTML_VALUE)
    public String atividade() {
        return "<!DOCTYPE html>"
                + "<html lang=\"pt-BR\">"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<title>Atividade IEC</title>"
                + "<style>"
                + "body { font-family: Arial, sans-serif; margin: 0; background: #f4f4f4; color: #111; }"
                + ".container { max-width: 760px; margin: 40px auto; background: #fff; padding: 32px; border-radius: 16px; box-shadow: 0 10px 30px rgba(0,0,0,0.12); }"
                + "h1, h2 { margin-top: 0; }"
                + ".badge { display: inline-block; padding: 8px 14px; border-radius: 999px; background: #111; color: #fff; font-weight: bold; }"
                + "audio { width: 100%; margin-top: 16px; }"
                + "a { color: #0b57d0; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class=\"container\">"
                + "<span class=\"badge\">Atividade Avaliativa 2.1 - IEC</span>"
                + "<h1>Mauricio Rafael Veiga</h1>"
                + "<p>Endpoint criado no controlador <strong>AtividadeController</strong>.</p>"
                + "<h2>Hino Oficial do Santos Futebol Clube</h2>"
                + "<p>Composto por Carlos Henrique Roma em 1957.</p>"
                + "<p>O player abaixo usa o audio publicado na pagina oficial do Santos FC.</p>"
                + "<audio controls>"
                + "<source src=\"http://unv.33d.myftpupload.com/wp-content/uploads/2022/04/Hino-Oficial-Santos-FC.mp3\" type=\"audio/mpeg\">"
                + "Seu navegador nao suporta audio HTML5."
                + "</audio>"
                + "<p>Fonte oficial: <a href=\"https://www.santosfc.com.br/hino-oficial/\" target=\"_blank\" rel=\"noopener noreferrer\">Santos FC - Hino Oficial</a></p>"
                + "</div>"
                + "</body>"
                + "</html>";
    }
}
