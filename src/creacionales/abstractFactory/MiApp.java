package creacionales.abstractFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MiApp {

	public static void main(String[] args) {
		EmpresaBus lineaUrbana = new ConcreteEmpresaBus();
		
		//Emite 
		PasajeBusUrbano pUrbano = lineaUrbana.emitePasajeBusUrbano("Ciudad Nueva", "Pablo Rojas", new GregorianCalendar(2018, Calendar.MARCH, 10, 11, 0));
		
		PasajeBusInterUrbano pInterestadual = lineaUrbana.emitePasajeBusInterUrbano("Hernandarias", "Franco", new GregorianCalendar(2018, Calendar.APRIL, 20, 8, 30));
		
		//muestra 
		pUrbano.mostrarDetalles();
		
		pInterestadual.mostrarDetalles();
	}

}
