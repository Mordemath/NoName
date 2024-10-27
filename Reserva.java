import java.time.LocalDateTime;

public class Reserva {
    private int id;                   // R-Id
    private double monto;             // R-Monto
    private LocalDateTime fecha;             // R-Fecha
    private LocalDateTime fechaDevolucion;   // R-Fecha Devolución
    private int clienteId;            // C-Id (id del cliente que reserva)
    private int transaccionId;        // T-Id (id de la transacción del pago)
    private int libroISBN;            // L-ISBN (isbn del libro de la reserva)

    // Constructor
    public Reserva(int id, double monto, LocalDateTime fecha, LocalDateTime fechaDevolucion, int clienteId, int transaccionId, int libroISBN) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.clienteId = clienteId;
        this.transaccionId = transaccionId;
        this.libroISBN = libroISBN;
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

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(int transaccionId) {
        this.transaccionId = transaccionId;
    }

    public int getLibroISBN() {
        return libroISBN;
    }

    public void setLibroISBN(int libroISBN) {
        this.libroISBN = libroISBN;
    }



}