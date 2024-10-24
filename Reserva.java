import java.util.Date;

public class Reserva {
    private int precio;
    private Date fechaReserva;
    private Date fechaDev;
    private int isbn;
    private int idUsuario;
    private Boolean estado;// cancelada o activa
    private Boolean estadoLibro;
    private int id;

    // Constructor
    public Reserva(Date fechaReserva, Date fechaDev, int isbn, int idUsuario, Boolean estado, int id) {
        this.fechaReserva = fechaReserva;
        this.fechaDev = fechaDev;
        this.isbn = isbn;
        this.idUsuario = idUsuario;
        this.estado = estado;
        this.id = id;
    }

    // Getters
    public int getPrecio() {
        return this.precio;
    }

    public Date getFechaReserva() {
        return this.fechaReserva;
    }

    public Boolean getEstadoLibro() {
        return this.estadoLibro;
    }

    public Date getFechaDev() {
        return this.fechaDev;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public int getId() {
        return this.id;
    }

    // Setters
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setEstadoLibro(Boolean estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void MostrarReserva() {
        // se accede a los get
    }

}