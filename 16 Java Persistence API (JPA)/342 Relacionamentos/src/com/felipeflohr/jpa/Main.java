package com.felipeflohr.jpa;

public class Main {
	/* Relacionamentos:
	  Recapitulando as relações no mundo E/R:
	  
	  ID (Primary Key)                         ID estrangeiro (Foreign Key)
	  -----------------                        -----------------
	  | 1| ...        |                        |        ... |  1|
	  | 2| ...        | Relação um para muitos |        ... |  1|
	  | 3| ...        | ---------------------> |        ... |  2| 
	  | .| ...        |                        |        ... |  .|
	  -----------------                        ------------------
	  
	  ID (Primary Key)                         ID estrangeiro (Foreign Key). Restrição Unique
	  -----------------                        -----------------
	  | 1| ...        |                        |        ... |  1|
	  | 2| ...        | Relação um para um     |        ... |  2|
	  | 3| ...        | ---------------------> |        ... |  3| 
	  | .| ...        |                        |        ... |  .|
	  -----------------                        ------------------
	  
	  
	                               (Primary Key será a junção das duas Foreign Keys)
	  ID (Primary Key)                              (FK)(FK)       
	  -----------------                             --------        ----------------- 
	  | 1| ...        |                             | 1| 1 |        |  1| ...       |
	  | 2| ...        | Relação muitos para muitos  | 1| 2 |        |  2| ...       |
	  | 3| ...        | --------------------------> | 2| 1 | <----- |  3| ...       |
	  | .| ...        |                             | .| . |        |  4| ...       |
	  -----------------                             --------        -----------------
	  
	  Relações no mundo OO:
	  Relações no mundo OO são feitas de maneira física. Assim, também é permitido que
	  exista relações bi-direcionais. Exemplo:
	  
	  Classe A                                 |  Classe B
	  -Classe A possui um atributo da Classe B |  Classe B possui um atributo da Classe A
	  
	  Relacionamento um para muitos:
	  
	  Classe Mae           | Classe Filho
	  -List<Filho> filhos; | -Mae mae;
	  
	  Relacionamento muitos para muitos;
	  Classe Tio                 | Classe Sobrinho  
	  -List<Sobrinho> sobrinhos; | -List<Tio> tios;
	  
	  ANOTAÇÕES DE RELAÇÕES DO JPA:
	  @OneToOne <- Relação de um para um
	  @OneToMany -- @ManyToOne <- Relação de um para muitos/muitos para um. Um aponta da mãe para o filho e o outro do filho para a mãe
	  @ManyToMany <- Relação do muitos para muitos
	 */
}
