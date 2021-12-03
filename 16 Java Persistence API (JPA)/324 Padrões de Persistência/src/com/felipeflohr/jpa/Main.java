package com.felipeflohr.jpa;

public class Main {
	/* Java Persistence API (JPA)
	   No JPA há dois principais padrões de projeto:
	   - Data Mapper (padrão utilizado pelo JPA): no Data Mapper, a classe não possuirá nen-
	   hum método relativo ao CRUD, somente getters e setters de seus atributos. Dessa ma-
	   neira, uma classe terceira terá que realizar as operações implementadas (geralmente
	   um DAO).
	   - Active Record (outro padrão também popular): Dentro da entidade haverão atributos
	   que estarão diretamente relacionados ás colunas de uma tabela, com isso, a própria
	   entidade terá todos os métodos necessários para se persistir.
	 */
}
