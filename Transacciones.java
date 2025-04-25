import java.time.LocalDateTime;
import java.util.Date;

public class Transacciones {
    private double monto;          // T-Monto
    private LocalDateTime fecha;          // T-Fecha
    private int id;                // T-Id
    private int idCliente;
    private int idTransaccion;
    private int idBibliotecario;
    private int idFactura;

    // Constructor
    public Transacciones(double monto, LocalDateTime fecha, int id,int idCliente, int idTransaccion, int idBibliotecario, int idFactura) {
        this.monto = monto;
        this.fecha = fecha;
        this.id = id;
        this.idTransaccion = idTransaccion;
        this.idBibliotecario = idBibliotecario;
        this.idFactura = idFactura;
        this.idCliente = idCliente;
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
        System.out.println("Factura[ID=" + id + ", Monto=" + monto + ", Fecha=" + fecha + "]");
        //Imprime el pdf de la factura
    }

    public void descargarPago(){
         System.out.println("Descargando comprobante pago ID=" + id);
        //Descarga el comprobante de pago
     }


    
}
