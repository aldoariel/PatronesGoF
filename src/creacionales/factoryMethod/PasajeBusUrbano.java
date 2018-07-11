package creacionales.factoryMethod;

import java.util.Calendar;

//Producto concreto
public class PasajeBusUrbano extends Pasaje {

	public PasajeBusUrbano(String origen, String destino, Calendar fechaHoraSalida) {
		
		super(origen, destino, fechaHoraSalida);
	}

	public void mostrarDetalles() {
		System.out.println("Pasaje Urbano: desde:" + this.getOrigen() + 
				" hasta " + this.getDestino() + 
				", Fecha/Hora: " + super.df.format(this.getFechaHoraSalida().getTime()));
	}

}
