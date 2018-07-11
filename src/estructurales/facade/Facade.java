package estructurales.facade;

class Facade {
	
	private SubsistemaUno sis1;
	private SubsistemaDos sis2;
	private SubsistemaTres sis3;
	
	public Facade(){
		sis1 = new SubsistemaUno();
		sis2 = new SubsistemaDos();
		sis3 = new SubsistemaTres();
	}
	
	public void metodoA(){
		sis1.metodoUno(); //subsistema 1
		sis2.metodoDos(); //subsistema 2
		sis3.metodoTres(); //subsistema 3
	}
	
	public void metodoB(){
		sis3.metodoTres(); //subsistema 3
		sis2.metodoDos(); //subsistema 2
		sis1.metodoUno(); //subsistema 1
	}
}