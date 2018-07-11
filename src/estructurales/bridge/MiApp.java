package estructurales.bridge;

public class MiApp {

	public static void main(String[] args) {
		
		Profesor grad = new ProfesorGrado(new ProfesorImplGrado());
		grad.op();
		
		Profesor posgrad = new ProfesorPosGrado(new ProfesorImplPosGrado());
		posgrad.op();
	}

}
