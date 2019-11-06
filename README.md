# Pobreflix API

Uma API que mantém os dados de usuário, filmes e séries, semelhante a Netflix (só que beeeem básica).

- Tecnologias utilizadas:
  * MySQL
  * JDK 1.8
  * Maven 3
  * Spring Boot
  * JPA e Hibernate
  * Swagger
  
- Funcionalidades:
  * Manutenção de usuários, filmes, séries e cartões de crédito
  
## Instruções para execução do projeto

1. No MySQL, crie o banco de dados **pobreflix_apirest**;
2. Verificar usuário e senha do banco de dados no arquivo "src/main/resources/application.properties" e alterar, caso necessário;
3. Importe o projeto para o Eclipse, através do caminho File->Import->Existing Maven Projects e aguarde o Maven baixar as dependências;
4. Abra o arquivo `ProjetoApplication.java` que está no package "com.pobreflix.projeto" em "src/main/java" e execute como JavaApplication (por padrão, aplicação irá rodar na porta 8080, caso já esteja ocupada, adicionar uma nova linha no arquivo "application.properties" com "server.port = xxxx", substituindo xxxx pelo número da porta disponível);
5. Acesse a documentação da api através da url: <http://localhost:xxxx/swagger-ui.html> (substituindo xxxx pelo número da porta na qual a aplicação está rodando).
