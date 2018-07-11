package estructurales.composite;
import java.util.ArrayList;
import java.util.List;


//Composite
public class Gerente extends Empleado {
  
    //Collection of child graphics.
    private List<Empleado> listaSubordinados = new ArrayList<Empleado>();
  
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }
     
    //Mostrar estructura 
    public void print() {
        System.out.println(super.nombre + ", $" + super.salario);
        for (Empleado e : listaSubordinados) {
            e.print();
        }
    }
  
    //Adiciona empleado a la estructura.
    public void add(Empleado e) {
        listaSubordinados.add(e);
    }
  
    //Quita empleado de la estructura.
    public void remove(Empleado e) {
        listaSubordinados.remove(e);
    }
}