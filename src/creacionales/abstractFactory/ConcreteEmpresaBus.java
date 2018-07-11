package creacionales.abstractFactory;
import java.util.Calendar;

public class ConcreteEmpresaBus extends EmpresaBus {

	public PasajeBusUrbano emitePasajeBusUrbano(String origen, String destino, Calendar fechaHoraPartida) {

		return new ConcretePasajeBusUrbano(origen, destino, fechaHoraPartida);
	}

	public PasajeBusInterUrbano emitePasajeBusInterUrbano(String origen, String destino, Calendar fechaHoraPartida) {

		return new ConcretePasajeBusInterUrbano(origen, destino, fechaHoraPartida);
	}

	//fabrica concreta que implemnta los metodos abs de la fab abs
	
	
}
