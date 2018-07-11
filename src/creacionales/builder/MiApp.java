package creacionales.builder;

public class MiApp {

	public static void main(String[] args) {
		Cocina cocina = new Cocina();
		
		//Builders
		SandwichBuilder b1 = new HamburguesaBuilder();
		SandwichBuilder b2 = new FishBuilder();
		
		cocina.cicinarSandwich(b2);
		b2.getSandwich();
		
		cocina.cicinarSandwich(b1);
		b1.getSandwich();
	}

}
