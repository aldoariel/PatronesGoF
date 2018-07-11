package estructurales.proxi;

// Sistema A 
public class RealImagen extends Imagen {
    private String filename;
 
    public RealImagen(String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }
 
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    public void mostrarImagen() { 
        System.out.println("Mostrando " + filename); 
    }
}
 