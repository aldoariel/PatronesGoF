package comportamentales.Command;

public class MiApp {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Invoker invoker = new Invoker();
		
		invoker.compute(new Suma(calculadora, 10));
		invoker.compute(new Suma(calculadora, 5));
		invoker.compute(new Suma(calculadora, 10));
		//Deshacer
		invoker.undo(2);
	}

}
