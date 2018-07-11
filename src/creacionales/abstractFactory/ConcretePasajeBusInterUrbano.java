package creacionales.abstractFactory;
import java.util.Calendar;

public class ConcretePasajeBusInterUrbano extends PasajeBusInterUrbano {
	
	public ConcretePasajeBusInterUrbano(String origen, String destino, Calendar fechaHoraSalida) {
		
		super(origen, destino, fechaHoraSalida);
	}

	public void mostrarDetalles() {
		System.out.println("Pasaje Inter Estadual desde : " + this.getOrigen() + 
				" hasta " + this.getDestino() + 
				", Fecha/Hora: " + super.df.format(this.getFechaHoraSalida().getTime()));
	}
}
