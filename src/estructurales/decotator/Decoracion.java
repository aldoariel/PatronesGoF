package estructurales.decotator;

//Decorator
public abstract class Decoracion extends Arbol{
	
	private final Arbol arbol;
	
	public Decoracion(Arbol arbol){
		this.arbol = arbol;
	}
	
	public void showAdornos() {
		arbol.showAdornos();
	}
}