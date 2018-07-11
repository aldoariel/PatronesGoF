package estructurales.proxi;

// Sistema B 
public class ProxyImagen extends Imagen {
    private String filename;
    private RealImagen image;
 
    public ProxyImagen(String filename) { 
        this.filename = filename; 
    }
 
    public void mostrarImagen() {
        if (image == null) {
           image = new RealImagen(filename);
        } 
        image.mostrarImagen();
    }
}