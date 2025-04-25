import java.time.LocalDateTime;

public class Reserva {
    private int id;                   // R-Id
    private double monto;             // R-Monto
    private LocalDateTime fechaReserva;             // R-Fecha
    private LocalDateTime fechaDevolucion;   // R-Fecha Devolución

    // Constructor
    public Reserva(int id, double monto, LocalDateTime fecha, LocalDateTime fechaDevolucion, int idCliente, int idBibliotecario, int idTransaccion, int isbnLibro) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.idCliente = idCliente;
        this.IdBibliotecario = idBibliotecario;
        this.isbnLibro = isbnLibro;
        this.idTransaccion = idTransaccion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void ticketReserva(){
        //Metodo que emite el ticket de reserva
    }

}
