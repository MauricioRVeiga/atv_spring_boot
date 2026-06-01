# Texto Final Para Entrega

## Descricao das alteracoes realizadas

Foi criada uma nova versao da aplicacao utilizando Spring Boot.
No projeto, foi adicionado o controlador `AtividadeController` com o endpoint `GET /atividade`, responsavel por retornar o nome completo do aluno: `Mauricio Rafael Veiga`.

Depois da alteracao no codigo-fonte, foi realizado novamente o processo de build da aplicacao para gerar o novo artefato `.jar`.
Na sequencia, foi criada a imagem Docker da nova versao com o nome `tarefa2_iec_springboot:mauriciorafaelveiga`, e a aplicacao foi executada localmente em container para validar o funcionamento correto do endpoint.

Por fim, a imagem tambem foi publicada no Docker Hub com a tag `v0.0.3`.

## Repositorio publico no Docker Hub

[https://hub.docker.com/r/mauricorveiga/mauriciorafaelveiga](https://hub.docker.com/r/mauricorveiga/mauriciorafaelveiga)

## Imagem publicada

`mauricorveiga/mauriciorafaelveiga:v0.0.3`

## Arquivos de evidencia

As evidencias das etapas executadas estao na pasta `evidencias/`, contendo:

- Processo de build
- Criacao da imagem Docker
- Execucao do container
- Aplicacao funcionando
- Publicacao no Docker Hub
