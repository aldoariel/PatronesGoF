package estructurales.decotator;

public class MiApp {

	public static void main(String[] args) {
		Arbol a = new ArbolNavidad();
		
		a = new Estrella(a);
a = new Bola(a);		a = new Bola(a);
	a = new Bola(a);a = new Bola(a);
		a = new Bola(a);
		a = new PicaPica(a);
		
		a.showAdornos();
	}

}
