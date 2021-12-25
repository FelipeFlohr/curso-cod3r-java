import com.felipeflohr.modularidade.app.Calculadora;

module app.financeiro {

	requires java.base;
	requires app.api;
	uses Calculadora;
}