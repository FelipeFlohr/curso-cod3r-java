module exerciciosfx {
	requires javafx.controls;
	opens com.felipeflohr.javafx; // JavaFX pede para fazer um Reflection, para isso é necessário abrir o pacote
}