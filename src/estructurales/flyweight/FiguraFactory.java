package estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FiguraFactory {

	private static final HashMap<String, Figura> figuras = new HashMap<String, Figura>();

	public static Figura getFigura(String nombre) {
		Figura fig = figuras.get(nombre);

		if (fig == null) {
			if (nombre.equals("Figura Circulo rellenada: ")) {
				fig = new Circulo(true);
				
			} else if (nombre.equals("Figura Circulo no rellenada: ")) {
				fig = new Circulo(false);
				
			} else if (nombre.equals("linea")) {
				fig = new Linea();
			}

			figuras.put(nombre, fig);
			imprimirFiguras(figuras);
		}
		
		return fig;
	}
	
	public static  void imprimirFiguras(Map<String, Figura> figuras) {
		for (Figura f : figuras.values()) {
			System.out.println("Nombe: " + f.toString());
		}
	}
}
