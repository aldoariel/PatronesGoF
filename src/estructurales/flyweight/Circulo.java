package estructurales.flyweight;

public class Circulo extends Figura {

	private boolean rellenado;
	
	public Circulo(boolean rellenado){
		super();
		this.rellenado = rellenado;
	}
	
	public void dibujar(String color) {
		if(rellenado){
			System.out.println("Figura Circulo esta rellenada..." + color);
		}
		else{
			System.out.println("Figura Circulo no esta rellenada..." + color);
		}
	}

	@Override
	public String toString() {
		return "Circulo [rellenado=" + rellenado + "]";
	}

}
