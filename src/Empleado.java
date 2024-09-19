import java.util.*;
public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;
    private String fechaIngreso;

    Scanner sc = new Scanner(System.in);
    public Empleado() {
    }
    public Empleado(String nombre, String puesto, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    public void trabajar(){
        System.out.println("El empleado se encuentra trabajando.");
    }
    public void recibirSalario(){
        System.out.println("Usted tiene: $" + salario);
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        double retiro = sc.nextDouble();
        salario = salario - retiro;
        System.out.println("El salario restante del empleado es de $" + salario);
    }
}
