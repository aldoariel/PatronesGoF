package estructurales.flyweight;

public class Linea extends Figura {

	public Linea(){
		super();
	}
	
	public void dibujar(String color) {
		System.out.println("Figura linea " + color);
	}

	@Override
	public String toString() {
		return "Linea []";
	}

}
