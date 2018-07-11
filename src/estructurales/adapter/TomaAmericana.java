package estructurales.adapter;

public class TomaAmericana extends Toma<EnchufeAmericano> {

	public String conecta(EnchufeAmericano plug) {
		return plug.tomarCorriente() + this.getNombreRedElectrica();
	}
	
	public String getNombreRedElectrica() {
		return "tomada americana";
	}
}
