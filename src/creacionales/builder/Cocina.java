package creacionales.builder;

public class Cocina{
	
	public void cicinarSandwich(SandwichBuilder builder){
		builder.abrirPan();
		builder.agregarIngredientes();
		builder.cerrarPan();
	}
}
