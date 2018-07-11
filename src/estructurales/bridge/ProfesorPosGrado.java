package estructurales.bridge;

public class ProfesorPosGrado extends Profesor{

	public ProfesorPosGrado(Implementador imp){
		super(imp);
	}
	
	public void op() {
		imp.opImpl();
	}
}
