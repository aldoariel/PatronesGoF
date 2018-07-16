package comportamentales.Command;

//ConcreteCommand
public class Suma extends Command {

	private Calculadora calculadora;
	private int numero;
	
	public Suma(Calculadora calculadora, int numero){
		this.calculadora = calculadora;
		this.numero = numero;
	}
	
	public void execute() {
		calculadora.setValor(calculadora.getValor() + numero);
    	System.out.println(calculadora.getValor());
	}

	public void undo() {
		calculadora.setValor(calculadora.getValor() - numero);
    	System.out.println(calculadora.getValor());
	}
}
