import java.time.LocalDateTime;
public class main {
    public static void main(String[] args) {
        GestionStock stock = new GestionStock(10, 123);
        stock.GenerarInforme();
        stock.Notificaciónes();

        Libro libro1 = new Libro("Java Básico", 111222, "Autor X", 300, Libro.DISPONIBLE, 1, "Editorial Y");
        System.out.println("Libro creado: " + libro1.getTitulo());

        Bibliotecario bib = new Bibliotecario("Ana", "pass", LocalDateTime.now(), "ana@mail.com", 1);
        bib.pedirReserva();

        Cliente cli = new Cliente("Luis", "pwd", LocalDateTime.now(), "luis@mail.com", 2);
        cli.buscarLibro();

        Reserva res = new Reserva(1, 0.0, LocalDateTime.now(), LocalDateTime.now().plusDays(7));
        res.ticketReserva();

        Transacciones tx = new Transacciones(150.0, LocalDateTime.now(), 1);
        tx.imprimirFactura();
        tx.descargarPago();

        Proveedores prov = new Proveedores("http://proveedor.com", "555-1234", "Prov1", "prov1@mail.com", 10);
        prov.mostrarCatalago();
        prov.venderLibro();
        prov.generarReciboDelPedido();
    }
}
