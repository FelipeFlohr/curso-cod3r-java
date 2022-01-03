# Maven
No Maven, existe um arquivo chamado *pom.xml*. Esse arquivo contém:
- Informações do Projeto
- Dependências do Projeto
- Plugins

## Gerenciador das Dependências
É o responsável por procurar no repositório as dependências descritas no arquivo *pom.xml*. Assim, baixando-as.

## Plugins
Dentro do Maven há um ciclo de vida no processo de deploy da aplicação. Exemplo: Compilação -> Teste -> Instalação. Os plugins eles podem serem específicos para cada ciclo da aplicação, ou seja, *x* plugins serão usados para a compilação, *y* plugins serão usados para o teste, etc.

## Convenção
O Maven possui uma convenção de estrutura de arquivos. Em um projeto padrão do Java, a pasta raíz de arquivos fica em *src/*, já no Maven fica em *src/main/java/*. Também existe a pasta *src/main/resources/*, na qual é uma pasta dedicada a recursos. Esses recursos podem ser HTML, fotos, JS, etc.

---
## Dependências
As dependências do Maven se encontram na tag *dependencies*. Veja todas as dependências geradas no Projeto do Spring Boot:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```