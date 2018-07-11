package estructurales.proxi;

public class MiApp {

	public static void main(String[] args) {
		Imagen image1 = new ProxyImagen("HiRes_10MB_Photo1");
        Imagen image2 = new ProxyImagen("HiRes_10MB_Photo2");
        
        image1.mostrarImagen();
        image2.mostrarImagen();
        
        image1.mostrarImagen();
	}

}
