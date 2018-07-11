package creacionales.builder;

public class HamburguesaBuilder extends SandwichBuilder{
	
	private Sandwich s = new Hamburguesa(); 
	
	public void abrirPan() {
		System.out.println("Abrir pan de  hamburguesa.");
	}

	public void agregarIngredientes() {
		System.out.println("Agrega carne y queso.");
	}

	public void cerrarPan() {
		System.out.println("Cerrar pan de  hamburguesa.");
	}

	public Sandwich getSandwich() {
		System.out.println("Hamburguesa Lista!");
		return s;
	}
}
