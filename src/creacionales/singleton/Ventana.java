package creacionales.singleton;
import java.awt.Dimension;
import javax.swing.JFrame;

//Singleton
public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Ventana j = null;

	public Ventana() {
		setPreferredSize(new Dimension(640, 480));
	}

	public static Ventana getVentanaUnica() {
		if(j==null){
			j = new Ventana();
		}
		return j;
	}
	
}