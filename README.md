# API Rest com Kotlin e Spring Boot 🚀

API Backend desenvolvida com **Kotlin** e **Spring Boot**, focada em boas práticas de arquitetura, segurança robusta com **OAuth2**, validação de dados e tratamento centralizado de exceções.

---

## 🛠️ Tecnologias e Ferramentas

* **[Kotlin](https://kotlinlang.org/)** (v2.x) - Linguagem principal
* **[Spring Boot](https://spring.io/projects/spring-boot)** (v3.x) - Framework de aplicação
* **[Spring Security & OAuth2](https://spring.io/projects/spring-security)** - Autenticação e autorização baseada em tokens
* **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - Persistência e mapeamento objeto-relacional
* **[Bean Validation](https://beanvalidation.org/)** - Validação de dados de entrada (`@NotNull`, `@Email`, `@NotBlank`, etc.)
* **[H2 Database](https://www.h2database.com/)** - Banco de dados em memória para desenvolvimento e testes rápidos
* **Maven / Gradle** - Gerenciamento de dependências

---

## ⚙️ Arquitetura e Principais Recursos

1. **Segurança com OAuth2:** Autenticação e emissão de tokens para proteção dos endpoints da API, utilizando roles e permissões customizadas.
2. **Tratamento Global de Exceções (`Exception Handler`):** Centralização dos erros da aplicação utilizando `@ControllerAdvice` para retornar respostas padronizadas e amigáveis ao cliente.
3. **Validação Rigorosa:** Uso do Bean Validation nos DTOs/Entidades para garantir a integridade dos dados recebidos nas requisições HTTP (`POST`, `PUT`).
4. **Banco H2 Integrado:** Pronto para rodar localmente sem a necessidade de configurar um banco externo, acessível via console web.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* **JDK 17** ou superior instalado na sua máquina.
* IDE de sua preferência (**IntelliJ IDEA** recomendada).

### Passos para rodar:

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
