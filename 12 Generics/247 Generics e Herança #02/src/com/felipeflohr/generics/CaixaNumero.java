package com.felipeflohr.generics;

// Dessa forma � poss�vel restringir o tipo que � inserido no Ge-
// neric. Abaixo, s� ser� poss�vel inserir valores num�ricos ten-
// do em vista que est� herdando da classe Number
public class CaixaNumero<N extends Number> extends Caixa<N> {

}
