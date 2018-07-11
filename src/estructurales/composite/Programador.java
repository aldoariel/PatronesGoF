package estructurales.composite;

//Leaf--ramas
public class Programador extends Empleado {
  
    public Programador(String nombre, double salario) {
        super(nombre, salario);
    }
 
    //Mostrar detalles de empleado
    public void print() {
        System.out.println(super.nombre + ", $" + super.salario);
    }
     
    //Adiciona 
    public void add(Empleado e) {
        System.out.println("No es posible adicionar empleado subordinado del programador");
    }
  
    //Remover
    public void remove(Empleado e) {
        System.out.println("No es posible Remover empleado subordinado del programador");
    }
}