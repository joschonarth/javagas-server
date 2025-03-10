# 💼 Javagas

**Javagas** é uma plataforma robusta para gestão de vagas de emprego, permitindo que candidatos criem perfis e se candidatem a vagas, enquanto empresas podem publicar oportunidades de trabalho. Esta é a parte do **back-end** do projeto, responsável por fornecer uma API RESTful segura e eficiente.

## 🛠️ Tecnologias Utilizadas

- ☕ **Java** - Linguagem principal utilizada para desenvolvimento.
- 🌱 **Spring Boot** - Facilita a criação e configuração da API RESTful.
- 📊 **Spring Data JPA** - Simplifica a interação com o banco de dados.
- 🐘 **PostgreSQL** - Banco de dados relacional utilizado para armazenar informações.
- 🛠️ **DBeaver** - Ferramenta para gerenciar e visualizar o banco de dados.
- 🐳 **Docker** - Containerização da aplicação para facilitar o desenvolvimento e a implantação.
- 🔄 **Hibernate** - Mapeamento objeto-relacional (ORM) para facilitar as operações no banco de dados.
- 📦 **Maven** - Gerenciador de dependências e automação do build.
- ✨ **Lombok** - Reduz a quantidade de código boilerplate gerando automaticamente getters, setters e construtores.
- 🔒 **Spring Security** - Implementa autenticação e autorização para controle de acesso.
- 🔑 **Java JWT** - Gera e valida tokens JWT para autenticação segura.
- 📗 **Swagger** - Documentação e testes interativos da API.
- 🧪 **JUnit** - Framework de testes unitários.
- 🛠️ **Mockito** - Cria mocks para testes unitários.
- 🔬 **Jacoco** - Ferramenta para análise de cobertura de código em testes unitários.
- 🔧 **Spring Actuator** - Fornece endpoints de monitoramento e gerenciamento da aplicação.
- 📊 **SonarQube** - Ferramenta para análise da qualidade do código.
- 📈 **Grafana** - Monitoramento e visualização de métricas.
- 📉 **Prometheus** - Coleta e armazenamento de métricas para monitoramento.

## ⚙️ Funcionalidades

### 🧑‍💻 Candidato

- 👤 **Criar um candidato**: Registra um novo candidato na plataforma.
- 🔐 **Autenticar candidato**: Realiza o login de um candidato.
- 🔎 **Buscar perfil de um candidato**: Retorna as informações do candidato autenticado.

### 🏢 Empresa

- 🏢 **Criar empresa**: Cadastra uma nova empresa no sistema.
- 🔐 **Autenticar empresa**: Permite que empresas realizem login.

### 💼 Vagas

- 📌 **Criar vaga**: Publica uma nova oportunidade de emprego.
- 📋 **Listar vagas**: Retorna todas as vagas disponíveis na plataforma.

## 🔗 Rotas da Aplicação

### 🧑‍💻 Rotas do Candidato

- **Criar candidato**: `POST` - `http://localhost:8080/candidate/`
- **Autenticar candidato**: `POST` - `http://localhost:8080/candidate/auth`
- **Buscar perfil de candidato**: `GET` - `http://localhost:8080/candidate/`

### 🏢 Rotas da Empresa

- **Criar empresa**: `POST` - `http://localhost:8080/company/`
- **Autenticar empresa**: `POST` - `http://localhost:8080/company/auth`

### 💼 Rotas de Vagas

- **Criar vaga**: `POST` - `http://localhost:8080/company/job/`
- **Listar vagas**: `GET` - `http://localhost:8080/company/job/`

## 🔧 Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/joschonarth/javagas-server.git
   ```

2. Inicie o banco de dados **PostgreSQL** utilizando o container **Docker** com a imagem ``bitnami/postgresql``:

   ```bash
   docker-compose up -d
   ```

3. **Inicie a API:**

   ```bash
   mvn spring-boot:run
   ```

   - 🚀A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).
   - 📜 Acesse a documentação da API em [Swagger UI](http://localhost:8080/swagger-ui.html).

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias ou correções. 🚀

## 📞 Contato

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joschonarth/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:joschonarth@gmail.com)
