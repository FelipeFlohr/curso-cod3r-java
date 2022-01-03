# Padrão MVC & Spring Boot
Contextualizando no Spring Boot:

1. Browser envia uma requisição através de uma URL para o Servidor (no caso do Spring Boot o Tomcat) na porta 8080 para cadastrar um produto. Esse produto contém uma série de informações (preço, id, etc). :arrow_heading_down:
2. Do Tomcat, a requisição passará para a aplicação :arrow_heading_down:
3. A aplicação passará a requisição para o **Front Controller** (no caso do Spring é a classe ***DispatcherServlet***) :arrow_heading_down:
4. Através do Front Controller, a requisição será passada para o Controller correto. O Spring consegue reconhecer um Controller através das Annotations :arrow_heading_down:
5. O Controller pedirá ao Model para cadastrar um novo produto. O Model contém uma série de camadas: camada da persistência (para inserir dados no DB), camada de validação (exemplo: nome do produto não pode ser nulo, desconto não pode ser maior que 1, etc). :arrow_heading_down:
6. O Model devolve ao Controller se o dado foi criado, etc. :arrow_heading_down:
7. O Controller eventualmente pode devolver um JSON para o Front Controller e o Front Controller pode devolver para o Browser. :arrow_heading_down: