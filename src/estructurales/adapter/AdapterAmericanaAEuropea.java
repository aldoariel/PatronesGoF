package estructurales.adapter;

//Adapter
public class AdapterAmericanaAEuropea extends TomaEuropea {
	
	public String conecta(EnchufeAmericano enchufe) {
		return enchufe.tomarCorriente() + this.getNombreRedElectrica();
	}
}
