package creacionales.abstractFactory;
import java.util.Calendar;

public abstract class EmpresaBus {
	
	public abstract PasajeBusUrbano emitePasajeBusUrbano(String origen, String destino, Calendar fechaHoraSalida);
	
	public abstract PasajeBusInterUrbano emitePasajeBusInterUrbano(String origen, String destino, Calendar fechaHoraSalida);
	
}
//esta es lafabr abs que emite famili de pasajes
