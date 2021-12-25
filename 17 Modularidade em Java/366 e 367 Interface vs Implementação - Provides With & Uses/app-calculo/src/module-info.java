import com.felipeflohr.modularidade.app.Calculadora;
import com.felipeflohr.modularidade.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging;
	exports com.felipeflohr.modularidade.app.calculo;

//	exports com.felipeflohr.modularidade.app.calculo.interno
//		to app.financeiro;

	opens com.felipeflohr.modularidade.app.calculo to app.financeiro;
	
	requires app.api;
	provides Calculadora with CalculadoraImpl; // Provém a interface "Calculadora" com a classe "CalculadoraImpl"
}