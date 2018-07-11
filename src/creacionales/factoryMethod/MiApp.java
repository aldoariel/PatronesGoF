package creacionales.factoryMethod;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MiApp {

	public static void main(String[] args) {
		//Empresas de buses
		Empresa lineaUrbana = new EmpresaBusUrbano();
				
		Empresa lineaInterUrbano = new EmpresaBusInterUrbano();
		
		//Emite 
		Pasaje pUrbano = lineaUrbana.emitePasaje("Ciudad Nueva ", "Pablo Rojas", new GregorianCalendar(2018, Calendar.MARCH, 10, 11, 0));
		
		Pasaje pInterUrbano = lineaInterUrbano.emitePasaje("Hernandarias", "Franco", new GregorianCalendar(2018, Calendar.APRIL, 20, 8, 30));
		
		//detalles
		
		pUrbano.mostrarDetalles();
		
		pInterUrbano.mostrarDetalles();
	}

}
