public class Libro {
    private String titulo;           // L-Título
    private int isbn;             // L-ISBN
    private String autor;            // L-Autor
    private int nHojas;              // L-Nhojas
    private String estado;           // L-Estado (Reservado, Disponible, En espera)
    private int edicion;             // L-Edición
    private String editorial;         // L-Editorial
    // Constantes para el estado
    public static final String RESERVADO = "Reservado";
    public static final String DISPONIBLE = "Disponible";
    public static final String ESPERA = "En espera";

    // Constructor
    public Libro(String titulo, int isbn, String autor, int nHojas, 
                 String estado, int edicion, String editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.nHojas = nHojas;
        this.estado = estado;
        this.edicion = edicion;
        this.editorial = editorial;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNHojas() {
        return nHojas;
    }

    public void setNHojas(int nHojas) {
        this.nHojas = nHojas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.equals(RESERVADO) || estado.equals(DISPONIBLE) || estado.equals(ESPERA)) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("Estado inválido. Debe ser 'Reservado', 'Disponible' o 'En espera'.");
        }
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
