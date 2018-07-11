package estructurales.composite;

//Component
public abstract class Empleado {
         
    protected String nombre;
    protected double salario;
     
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
 
    //Exibe detalles
    public abstract void print();
     
    public abstract void add(Empleado e);
    public abstract void remove(Empleado e);
}