package estructurales.adapter;

public class TomaEuropea extends Toma<EnchufeEuropeo> {
	
	public String conecta(EnchufeEuropeo enchufe) {
		return enchufe.tomarCorriente() + this.getNombreRedElectrica();
	}
	
	public String getNombreRedElectrica() {
		return "toma Europea";
	}
}
