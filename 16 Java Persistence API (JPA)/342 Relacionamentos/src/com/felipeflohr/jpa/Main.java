package com.felipeflohr.jpa;

public class Main {
	/* Relacionamentos:
	  Recapitulando as rela��es no mundo E/R:
	  
	  ID (Primary Key)                         ID estrangeiro (Foreign Key)
	  -----------------                        -----------------
	  | 1| ...        |                        |        ... |  1|
	  | 2| ...        | Rela��o um para muitos |        ... |  1|
	  | 3| ...        | ---------------------> |        ... |  2| 
	  | .| ...        |                        |        ... |  .|
	  -----------------                        ------------------
	  
	  ID (Primary Key)                         ID estrangeiro (Foreign Key). Restri��o Unique
	  -----------------                        -----------------
	  | 1| ...        |                        |        ... |  1|
	  | 2| ...        | Rela��o um para um     |        ... |  2|
	  | 3| ...        | ---------------------> |        ... |  3| 
	  | .| ...        |                        |        ... |  .|
	  -----------------                        ------------------
	  
	  
	                               (Primary Key ser� a jun��o das duas Foreign Keys)
	  ID (Primary Key)                              (FK)(FK)       
	  -----------------                             --------        ----------------- 
	  | 1| ...        |                             | 1| 1 |        |  1| ...       |
	  | 2| ...        | Rela��o muitos para muitos  | 1| 2 |        |  2| ...       |
	  | 3| ...        | --------------------------> | 2| 1 | <----- |  3| ...       |
	  | .| ...        |                             | .| . |        |  4| ...       |
	  -----------------                             --------        -----------------
	  
	  Rela��es no mundo OO:
	  Rela��es no mundo OO s�o feitas de maneira f�sica. Assim, tamb�m � permitido que
	  exista rela��es bi-direcionais. Exemplo:
	  
	  Classe A                                 |  Classe B
	  -Classe A possui um atributo da Classe B |  Classe B possui um atributo da Classe A
	  
	  Relacionamento um para muitos:
	  
	  Classe Mae           | Classe Filho
	  -List<Filho> filhos; | -Mae mae;
	  
	  Relacionamento muitos para muitos;
	  Classe Tio                 | Classe Sobrinho  
	  -List<Sobrinho> sobrinhos; | -List<Tio> tios;
	  
	  ANOTA��ES DE RELA��ES DO JPA:
	  @OneToOne <- Rela��o de um para um
	  @OneToMany -- @ManyToOne <- Rela��o de um para muitos/muitos para um. Um aponta da m�e para o filho e o outro do filho para a m�e
	  @ManyToMany <- Rela��o do muitos para muitos
	 */
}
