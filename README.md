# Atividade Avaliativa 2.1 - IEC

Aplicacao Spring Boot com o controlador `AtividadeController` e endpoint `GET /atividade`, que retorna o nome completo do aluno.

## Build

```powershell
docker run --rm -v "${PWD}:/workspace" -w /workspace maven:3.9.11-eclipse-temurin-8 mvn -B -ntp clean package
```

## Docker

```powershell
docker build -t tarefa2_iec_springboot:mauriciorafaelveiga .
docker run --rm -p 8080:8080 tarefa2_iec_springboot:mauriciorafaelveiga
```

## Docker Hub

```powershell
docker tag tarefa2_iec_springboot:mauriciorafaelveiga mauricorveiga/mauriciorafaelveiga:v0.0.2
docker push mauricorveiga/mauriciorafaelveiga:v0.0.2
```
