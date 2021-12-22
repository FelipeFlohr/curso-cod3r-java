Os módulos 347 e 348 estão dentro do mesmo projeto pois esqueci que de separá-los :/

O módulo 347 foi a respeito da relação bi-direcional através da anotação @OneToMany no atributo itens da classe Pedido e da anotação @ManyToOne na classe ItemPedido.
O módulo 348 foi a respeito dos fetch types LAZY e EAGER, sendo LAZY um fetch que apenas traz resultados quando chamado explicitamente (através de um getter, por exemplo), já o EAGER traz resultados assim que inicializado.