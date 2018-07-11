package estructurales.composite;

public class MiApp {

	public static void main(String[] args) {
		//Crea programadores (ramas)
		Programador pPasante = new Programador("José", 900);
		
		Programador pJunior = new Programador("Pedro", 2900);
		
		Programador pSenior = new Programador("Ricardo", 3900);
		
		//Gerentes
		Gerente g3 = new Gerente("Juan", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        
        Gerente g1 = new Gerente("Carlos", 5000);
        
        //Montar la estructura de arbol
        
        //Carlos supervisiona a los programadores José e Pedro
        g1.add(pPasante);
        g1.add(pJunior);
        
        //Maria supervisiona al  programador Ricardo
        g2.add(pSenior);
        
        //Juan es  nivel raiz de la estructura de arbol
        g3.add(g1);
       g3.add(g2);
        
       g3.print();
	}

}
