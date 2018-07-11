package estructurales.bridge;

public abstract class Profesor{
	
	protected Implementador imp = new ProfesorImplGrado();
	
	protected Profesor(Implementador imp){
		this.imp = imp;
	}
	
	public abstract void op();
}
