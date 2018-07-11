package creacionales.factoryMethod;


import java.util.Calendar;

//Fabrica concreta
public class EmpresaBusUrbano extends Empresa {

	public Pasaje emitePasaje(String origen, String destino, Calendar fechaHoraSalida) {
		
		return new PasajeBusUrbano(origen, destino, fechaHoraSalida);
	}
	
}
