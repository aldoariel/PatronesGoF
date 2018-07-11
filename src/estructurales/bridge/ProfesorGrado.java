package estructurales.bridge;

public class ProfesorGrado extends Profesor{
	
	public ProfesorGrado(Implementador imp){
		super(imp);
	}
	
	public void op() {
		System.out.println("Hola desde Prof grado");
		imp.opImpl();
	}
}
