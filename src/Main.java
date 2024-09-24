import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Empleado> empleados = new ArrayList<>();
        Empleado em1 = new Empleado("Brayan", "Jefe", 5000000, "15/08/23");
        Empleado em2 = new Empleado("Duban", "Gerente", 2000000, "01/04/24");
        Empleado em3 = new Empleado("Cristian", "Supervisor", 1500000, "01/07/24");
        empleados.add(em1);
        empleados.add(em2);
        empleados.add(em3);
        List <Pelicula> peliculas = new ArrayList<>();
        Pelicula p1 = new Pelicula("The whitcher", "Almonacid", "Intriga", "2:20");
        Pelicula p2 = new Pelicula("Fast and Furious", "Yair", "Accion", "1:50");
        Pelicula p3 = new Pelicula("Resident evil", "Garzon", "Accion", "2:10");
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        List <Pedido> pedidos = new ArrayList<>();
        Pedido pe1 = new Pedido(1, "15/02/23", "Pendiente", "Juan");
        Pedido pe2 = new Pedido(2, "10/05/23", "Pendiente", "Kevin");
        Pedido pe3 = new Pedido(3, "06/04/24", "Pendiente", "Ferney");
        pedidos.add(pe1);
        pedidos.add(pe2);
        pedidos.add(pe3);

        for (Empleado em: empleados){
            System.out.println(em);
            em.trabajar();
            em.recibirSalario();
        }
        for (Pelicula p: peliculas){
            System.out.println(p);
            p.reproducir();
            p.detener();
        }
        for (Pedido pe: pedidos){
            System.out.println(pe);
            pe.realizarPedido();
            pe.cancelarPedido();
        }
    }
}