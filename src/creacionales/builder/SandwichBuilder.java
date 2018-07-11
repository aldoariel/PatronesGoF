package creacionales.builder;
//Builder
public abstract class SandwichBuilder {
	public abstract void abrirPan();
	public abstract void agregarIngredientes();
	public abstract void cerrarPan();
	public abstract Sandwich getSandwich(); 
}