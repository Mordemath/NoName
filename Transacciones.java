import java.time.LocalDateTime;
import java.util.Date;

public class Transacciones {
    private double monto;          // T-Monto
    private LocalDateTime fecha;          // T-Fecha
    private int id;                // T-Id
    private Integer bibliotecarioId; // B-Id (opcional)
    private String proveedorNombre; // P-Nombre (opcional)

    // Constructor
    public Transacciones(double monto, LocalDateTime fecha, int id, Integer bibliotecarioId, String proveedorNombre) {
        this.monto = monto;
        this.fecha = fecha;
        this.id = id;
        this.bibliotecarioId = bibliotecarioId;
        this.proveedorNombre = proveedorNombre;
    }

    // Getters y Setters
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBibliotecarioId() {
        return bibliotecarioId;
    }

    public void setBibliotecarioId(Integer bibliotecarioId) {
        this.bibliotecarioId = bibliotecarioId;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    
}