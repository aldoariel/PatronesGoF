package creacionales.abstractFactory;
import java.util.Calendar;

public class ConcretePasajeBusUrbano extends PasajeBusUrbano {

	public ConcretePasajeBusUrbano(String origem, String destino, Calendar fechaHoraSalida) {
		
		super(origem, destino, fechaHoraSalida);
	}

	public void mostrarDetalles() {
		System.out.println("Pasaje Urbano desde: " + this.getOrigen() + 
				" hasta " + this.getDestino() + 
				", Fecha/Hora: " + super.df.format(this.getFechaHoraSalida().getTime()));
	}

}
