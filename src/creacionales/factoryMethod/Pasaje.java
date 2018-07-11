package creacionales.factoryMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Producto
public abstract class Pasaje {
	
	private String origen;
	private String destino;
	private Calendar fechaHoraSalida;
	
	//Formato fecha
	protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public Pasaje(String origen, String destino, Calendar fechaHoraSalida) {
		this.origen = origen;
		this.destino = destino;
		this.fechaHoraSalida = fechaHoraSalida;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setorigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(Calendar fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	
	public abstract void mostrarDetalles();
	
}
