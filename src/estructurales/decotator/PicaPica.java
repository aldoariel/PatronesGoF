package estructurales.decotator;

//ConcreteDecorator
public class PicaPica extends Decoracion{
		
	public PicaPica(Arbol a) {
		super(a);
	}

	public void showAdornos() {
		super.showAdornos();
		System.out.print("Pica-pica, ");
	}
}
