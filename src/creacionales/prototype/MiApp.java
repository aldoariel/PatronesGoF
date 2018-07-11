package creacionales.prototype;

public class MiApp {

	public static void main(String[] args) {
		//Cargar las notas a partitura
		Partitura.cargarNotas();

		//musica
		Partitura.getNota("Do").escribe();
		Partitura.getNota("Re").escribe();
		Partitura.getNota("Mi").escribe();
		Partitura.getNota("Fa").escribe();
		Partitura.getNota("Fa").escribe();
		Partitura.getNota("Fa").escribe();
		Partitura.getNota("Do").escribe();
		Partitura.getNota("Re").escribe();
		Partitura.getNota("Do").escribe();
		Partitura.getNota("Re").escribe();
		Partitura.getNota("Re").escribe();
		Partitura.getNota("Re").escribe();
	}

}
