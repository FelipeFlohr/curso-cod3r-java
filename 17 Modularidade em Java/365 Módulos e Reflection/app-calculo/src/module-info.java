open module app.calculo {
	requires app.logging;
	exports com.felipeflohr.modularidade.app.calculo;

	exports com.felipeflohr.modularidade.app.calculo.interno
		to app.financeiro;
}