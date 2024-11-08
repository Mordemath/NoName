import java.time.LocalDateTime;
import java.util.Date;

public class Transacciones {
    private double monto;          // T-Monto
    private LocalDateTime fecha;          // T-Fecha
    private int id;                // T-Id

    // Constructor
    public Transacciones(double monto, LocalDateTime fecha, int id) {
        this.monto = monto;
        this.fecha = fecha;
        this.id = id;
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

    public void imprimirFactura(){
        //metodo que imprime la factura
    }

    public void descargarPago(){
        //metodo que permite descargar el pago
     }

<<<<<<< HEAD
    public String getProveedorNombre() {

    }

    public void setProveedorNombre(String proveedorNombre) {

    }    
=======

    
>>>>>>> 2aedce6956dd8b6aa1fc3d8da9d8c95acedb8599
}
