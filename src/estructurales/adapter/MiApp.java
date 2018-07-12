package estructurales.adapter;

public class MiApp {

	public static void main(String[] args) {
		//Target
		TomaEuropea tomaEuro = new TomaEuropea();
		
		//Adaptado
		EnchufeAmericano enchufeAmericano = new EnchufeAmericano();

		AdapterAmericanaAEuropea tomadaModificada = new AdapterAmericanaAEuropea();
		String s = tomadaModificada.conecta(enchufeAmericano);
		
		//String ss = tomaEuro.conecta(enchufeAmericano);

		System.out.println(s);
		
	}

}
