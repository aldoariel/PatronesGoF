package estructurales.adapter;

//Target
public abstract class Toma<P> {

	public abstract String conecta(P enchufe);
	
	public abstract String getNombreRedElectrica();
}
