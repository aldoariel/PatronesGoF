package creacionales.singleton;

public class MiApp {

	public static void main(String[] args) {
		Ventana j = Ventana.getVentanaUnica();
		j.pack();//		Hace que se dimensione para ajustarse al tamaño y diseños preferidos de sus subcomponentes
		j.setVisible(true);
		j.setTitle("primeraVentana");
		
		Ventana j2 = Ventana.getVentanaUnica();
		j2.pack();
		j2.setVisible(true);
		j2.setTitle("segundaVentana");
	}

}
