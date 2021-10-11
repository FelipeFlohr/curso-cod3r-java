package com.felipeflohr.generics;

// Dessa forma é possível restringir o tipo que é inserido no Ge-
// neric. Abaixo, só será possível inserir valores numéricos ten-
// do em vista que está herdando da classe Number
public class CaixaNumero<N extends Number> extends Caixa<N> {

}
