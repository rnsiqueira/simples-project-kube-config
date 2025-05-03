# Simples Project Kube Config

**Simples Project Kube Config** é um projeto Java com configurações preparadas para **deploy em ambientes Kubernetes**. Desenvolvido com **Gradle**, ele serve como modelo para empacotamento e publicação de aplicações Java em clusters Kubernetes com YAMLs organizados e estrutura pronta para integração com pipelines de CI/CD.

## 📃 Visão Geral

O projeto tem como foco demonstrar a configuração essencial para aplicações Spring/Java serem executadas em ambientes orquestrados com Kubernetes, com manifestos e configuração de serviços, deployment e secrets.

## 🚀 Tecnologias Utilizadas

* **Java** (versão configurável no Gradle)
* **Gradle** (build.gradle)
* **Docker** (para image build)
* **Kubernetes** (manifests YAML)

## 🔗 Estrutura do Projeto

* `k8s/` – Manifests Kubernetes:

    * `deployment.yaml`
    * `service.yaml`
    * `configmap.yaml`
    * `secret.yaml`
* `Dockerfile` – Build da imagem Docker
* `src/` – Código fonte da aplicação Java
* `build.gradle` – Script de build com dependências

## 🛠️ Como Executar/Deploy com Kubernetes

1. **Build do projeto com Gradle**:

   ```bash
   ./gradlew build
   ```

2. **Build da imagem Docker**:

   ```bash
   docker build -t seu-usuario/seu-app:latest .
   ```

3. **Envio para um container registry** (Docker Hub ou GCR, por exemplo):

   ```bash
   docker push seu-usuario/seu-app:latest
   ```

4. **Deploy no cluster Kubernetes**:

   ```bash
   kubectl apply -f k8s/
   ```

## 💼 Possíveis Extensões

* Integração com Helm charts
* Automatização com GitHub Actions ou GitLab CI
* Escalonamento automático (HPA)
* Monitoramento com Prometheus/Grafana

## 📄 Licença

Projeto com finalidade educativa e de base para novos microserviços Java.

## 🤝 Contribuições

Sugestões e melhorias são bem-vindas! Sinta-se livre para abrir uma issue ou enviar um pull request.

## 📢 Contato

Projeto mantido por [Rafael N. Siqueira](https://github.com/rnsiqueira).
