package estructurales.flyweight;

public class MiApp {

	public static void main(String[] args) {
		
		Figura l = FiguraFactory.getFigura("linea");
		l.dibujar("azul");
		
		Figura c = FiguraFactory.getFigura("Figura Circulo no rellenada: ");
		c.dibujar("verde");
		

	}

}
