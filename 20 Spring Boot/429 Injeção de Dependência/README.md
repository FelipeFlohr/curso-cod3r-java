# Injeção de Dependência
Injeção de Dependência é uma das possíveis formas de se ter inversão de controle.

## Inversion of Control -> Dependence Injection
Exemplo: uma classe *A* precisa instanciar uma classe *B*, então, normalmente, o que aconteceria seria algo do tipo:
```java
@RestController
class A {

    B b = new B();
}
```

No caso da inversão de controle, ao invés de *A* fazer a instanciação, ele marca o atributo como ***@Autowired***, passando então a responsabilidade de instanciar a classe para o Framework, ficando então:
```java
@RestController
class A {

    @Autowired
    B b;
}
```