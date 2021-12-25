module app.calculo {
	requires app.logging;
	exports com.felipeflohr.modularidade.app.calculo;

	// Dessa maneira abaixo, o "exports to" cria a possibilidade de exportar determinado pa-
	// cote para certo módulo
	exports com.felipeflohr.modularidade.app.calculo.interno
		to app.financeiro;
}