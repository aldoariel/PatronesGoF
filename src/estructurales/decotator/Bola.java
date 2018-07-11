package estructurales.decotator;

//ConcreteDecorator
public class Bola extends Decoracion{
	
	public Bola(Arbol a) {
		super(a);
	}

	public void showAdornos() {
		super.showAdornos();
		System.out.print("Bola, ");
	}
	
}
