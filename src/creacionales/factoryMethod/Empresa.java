package creacionales.factoryMethod;

import java.util.Calendar;

//Fabrica
public abstract class Empresa {
	
	public abstract Pasaje emitePasaje(String origen, String destino, Calendar fechaHoraSalida);
	
}
