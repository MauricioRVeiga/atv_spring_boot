# Passo A Passo Para Testar E Explicar No Video

## 1. Mostrar o projeto

Explique rapidamente:

- Este e o projeto Spring Boot da atividade.
- Foi criado o controlador `AtividadeController`.
- O endpoint novo e `GET /atividade`.
- Esse endpoint retorna o nome completo do aluno.

Arquivo principal para mostrar:

- `src/main/java/br/com/mauriciorafaelveiga/demo/AtividadeController.java`

## 2. Mostrar o codigo do endpoint

Trecho para explicar:

```java
@RestController
public class AtividadeController {

    @GetMapping("/atividade")
    public String atividade() {
        return "Mauricio Rafael Veiga";
    }
}
```

Fala sugerida:

"Aqui eu criei o controlador `AtividadeController`. Nele, adicionei o endpoint `/atividade`, que retorna meu nome completo, conforme solicitado no enunciado."

## 3. Mostrar o build da aplicacao

No terminal, dentro de `C:\atv_spring_boot`, execute:

```powershell
docker run --rm -v "${PWD}:/workspace" -w /workspace maven:3.9.11-eclipse-temurin-8 mvn -B -ntp clean package
```

O que explicar:

- Esse comando executa o Maven dentro de um container.
- Ele recompila o projeto.
- Executa os testes.
- Gera o arquivo `.jar` da aplicacao.

O que mostrar no final:

- `BUILD SUCCESS`

## 4. Mostrar o artefato gerado

Comando:

```powershell
Get-ChildItem .\target\
```

O que explicar:

- O build gerou o arquivo `tarefa2-iec-springboot-0.0.2.jar`.
- Esse e o artefato usado na criacao da imagem Docker.

## 5. Mostrar a criacao da imagem Docker

Comando:

```powershell
docker build -t tarefa2_iec_springboot:mauriciorafaelveiga .
```

O que explicar:

- Esse comando cria a imagem Docker da aplicacao atualizada.
- O nome da imagem segue o padrao pedido na atividade.

Depois, mostre a imagem criada:

```powershell
docker image ls
```

## 6. Executar o container localmente

Comando:

```powershell
docker run --rm -p 8080:8080 tarefa2_iec_springboot:mauriciorafaelveiga
```

O que explicar:

- Aqui eu executo a aplicacao dentro de um container.
- A porta `8080` do container fica exposta localmente.

Quando aparecer que o Tomcat iniciou, abra outro terminal.

## 7. Testar a aplicacao funcionando

No segundo terminal, execute:

```powershell
Invoke-WebRequest -UseBasicParsing http://localhost:8080/atividade
```

Ou, se preferir mostrar so a resposta:

```powershell
(Invoke-WebRequest -UseBasicParsing http://localhost:8080/atividade).Content
```

Resultado esperado:

```text
Mauricio Rafael Veiga
```

O que explicar:

- O endpoint respondeu corretamente.
- Isso valida que a alteracao foi aplicada com sucesso.

## 8. Mostrar a imagem publicada no Docker Hub

Comando para listar a tag publicada localmente:

```powershell
docker image ls | findstr mauricorveiga
```

Link para abrir no navegador:

[https://hub.docker.com/r/mauricorveiga/mauriciorafaelveiga](https://hub.docker.com/r/mauricorveiga/mauriciorafaelveiga)

O que explicar:

- A imagem foi publicada no Docker Hub.
- A tag publicada foi `v0.0.3`.

## 9. Opcional: testar puxando do Docker Hub

Se quiser reforcar no video que a imagem publicada funciona, pare o container atual e execute:

```powershell
docker pull mauricorveiga/mauriciorafaelveiga:v0.0.3
docker run --rm -p 8080:8080 mauricorveiga/mauriciorafaelveiga:v0.0.3
```

Depois teste novamente:

```powershell
(Invoke-WebRequest -UseBasicParsing http://localhost:8080/atividade).Content
```

## 10. Encerramento sugerido

Fala final:

"Nesta atividade eu alterei a aplicacao Spring Boot criando o controlador `AtividadeController` e o endpoint `/atividade`, gerei novamente o artefato da aplicacao, criei a imagem Docker, validei o funcionamento localmente e publiquei a nova versao no Docker Hub."

## Ordem recomendada para gravar

1. Mostrar o enunciado rapidamente.
2. Mostrar o controlador criado.
3. Rodar o build.
4. Mostrar o `.jar` gerado.
5. Criar a imagem Docker.
6. Executar o container.
7. Testar o endpoint no navegador ou terminal.
8. Mostrar o Docker Hub.
9. Encerrar resumindo o que foi feito.
