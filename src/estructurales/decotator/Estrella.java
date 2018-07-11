package estructurales.decotator;

//ConcreteDecorator
public class Estrella extends Decoracion{
		
	public Estrella(Arbol a) {
		super(a);
	}

	public void showAdornos() {
		super.showAdornos();
		System.out.print("Estrella, ");
	}
}
