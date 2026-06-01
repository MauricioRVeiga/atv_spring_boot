# Atividade Avaliativa 2.1 - IEC

Aplicacao Spring Boot com o controlador `AtividadeController` e endpoint `GET /atividade`.

Ao acessar a rota, a aplicacao exibe uma pagina HTML com:

- nome completo do aluno
- referencia ao hino oficial do Santos Futebol Clube
- player de audio com o hino

## Build

No seu ambiente local atual, o terminal do Windows esta usando `JRE` e nao `JDK`.
Por isso, para build local voce pode usar o Eclipse ou Maven via Docker.

### Opcao 1: Eclipse

- `Run As > Maven build...`
- Goal: `clean package`

### Opcao 2: Maven via Docker

```powershell
docker run --rm -v "${PWD}:/workspace" -w /workspace maven:3.9.11-eclipse-temurin-8 mvn -B -ntp clean package
```

### Opcao 3: Maven Wrapper

Quando houver `JDK` configurado na maquina:

```powershell
.\mvnw.cmd clean package
```

## Docker

```powershell
docker build -t tarefa2_iec_springboot:mauriciorafaelveiga .
docker run --rm -p 8080:8080 tarefa2_iec_springboot:mauriciorafaelveiga
```

## Docker Hub

```powershell
docker tag tarefa2_iec_springboot:mauriciorafaelveiga mauricorveiga/mauriciorafaelveiga:v0.0.3
docker push mauricorveiga/mauriciorafaelveiga:v0.0.3
```

## Docker Compose

```powershell
docker compose up -d
```

## GitHub Actions

O projeto tambem foi ajustado para seguir o modelo do repositorio de referencia, incluindo:

- `Maven Wrapper` com `mvnw` e `mvnw.cmd`
- workflow em `.github/workflows/ci.yml`
- build automatico no push para `main`
- execucao de testes
- geracao do `.jar`
- build e push da imagem Docker no Docker Hub

### Secrets necessarios no GitHub

- `DOCKER_USERNAME`
- `DOCKER_PASSWORD`
