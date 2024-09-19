import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Empleado> empleados = new ArrayList<>();
        List <Pelicula> peliculas = new ArrayList<>();
        List <Pedido> pedidos = new ArrayList<>();
        Empleado em1 = new Empleado();
        Empleado em2 = new Empleado();
        Empleado em3 = new Empleado();
        empleados.add(em1);
        empleados.add(em2);
        empleados.add(em3);
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();
        Pelicula p3 = new Pelicula();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        Pedido pe1 = new Pedido();
        Pedido pe2 = new Pedido();
        Pedido pe3 = new Pedido();
        pedidos.add(pe1);
        pedidos.add(pe2);
        pedidos.add(pe3);
    }
}