import java.time.LocalDateTime;

public class Contato {
    private int id; // Fk Proveedor
    private int idBibliotecario;// Fk Bibliotecario
    private LocalDateTime fecha;

     // Constructor
     public Contato(int id, int idBibliotecario, LocalDateTime fecha) {
        this.id = id;
        this.idBibliotecario = idBibliotecario;
        this.fecha = fecha;
    }

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para idBibliotecario
    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    // Setter para idBibliotecario
    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    // Getter para fecha
    public LocalDateTime getFecha() {
        return fecha;
    }

    // Setter para fecha
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}