# Atividade Avaliativa 2.1 - IEC
Aplicação Spring Boot com o controlador `AtividadeController` e endpoint `GET /atividade`.
Ao acessar a rota, a aplicação exibe uma página HTML com:
- nome completo do aluno
- referência ao hino oficial do Santos Futebol Clube
- player de áudio com o hino
## Build
No seu ambiente local atual, o terminal do Windows está usando `JRE` e não `JDK`.
Por isso, para build local você pode usar o Eclipse ou Maven via Docker.
### Opção 1: Eclipse
- `Run As > Maven build...`
- Goal: `clean package`
### Opção 2: Maven via Docker
```powershell
docker run --rm -v "${PWD}:/workspace" -w /workspace maven:3.9.11-eclipse-temurin-8 mvn -B -ntp clean package
```
### Opção 3: Maven Wrapper
Quando houver `JDK` configurado na máquina:
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
O projeto também foi ajustado para seguir o modelo do repositório de referência, incluindo:
- `Maven Wrapper` com `mvnw` e `mvnw.cmd`
- workflow em `.github/workflows/ci.yml`
- build automático no push para `main`
- execução de testes
- geração do `.jar`
- build e push da imagem Docker no Docker Hub
### Secrets necessários no GitHub
- `DOCKER_USERNAME`
- `DOCKER_PASSWORD`
