module app.financeiro {

	requires java.base; // Este pacote é requirido por padrão, pois dentro dele contém o pacote java.lang, ou seja, é requirido de forma implícita
	requires app.calculo;
}