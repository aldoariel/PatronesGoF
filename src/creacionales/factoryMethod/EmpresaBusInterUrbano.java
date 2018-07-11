package creacionales.factoryMethod;


import java.util.Calendar;

//Fabrica concreta
public class EmpresaBusInterUrbano extends Empresa {

	public Pasaje emitePasaje(String origen, String destino, Calendar fechaHoraSalida) {
		
		return new PasajeBusInterUrbano(origen, destino, fechaHoraSalida);
	}

	

}
