import java.util.*;
public class Pedido {
    private int numPedido = 0;
    private String fecha;
    private String estado;
    private String cliente;

    Scanner sc = new Scanner(System.in);

    public Pedido() {
    }
    public Pedido(int numPedido, String fecha, String estado, String cliente) {
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
    }

    public int getNumPedido() {
        return numPedido;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                ", cliente='" + cliente + '\'' +
                '}';
    }

    public void realizarPedido(){
        System.out.println("Desea realizar un pedido?\n1. Si\2. No");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Bienvenido a su casillero internacional");
                System.out.println("Ingrese su nombre:");
                cliente = sc.next();
                System.out.println("Ingrese la fecha en la que esta realizando el pedido (dd/mm/aa):");
                fecha = sc.next();
                System.out.println("Qué objeto desea retirar de su casillero?");
                System.out.println("Actualmente tiene:\n1.MacBook\n2.Iphone\n3.Tarjeta grafica");
                String pedido = sc.next();
                System.out.println("Su pedido numero " + (numPedido ++) + " esta siendo procesado.");
                break;
            case 2:
                System.out.println("vuelva pronto!");
                break;
        }
    }
    public void cancelarPedido(){
        System.out.println("Su pedido numero " + numPedido + " ha sido cancelado.");
    }
}
