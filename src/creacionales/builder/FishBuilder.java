package creacionales.builder;

public class FishBuilder extends SandwichBuilder{

	private Sandwich s = new Fishburguer(); 
	
	public void abrirPan() {
		System.out.println("Abrir pan de fishburguer.");
	}

	public void agregarIngredientes() {
		System.out.println("Agregar filete de pescado.");
	}

	public void cerrarPan() {
		System.out.println("Cerrar pan de fishburguer.");
	}

	public Sandwich getSandwich() {
		System.out.println("Fishburguer Listo !");
		return s;
	}
}
