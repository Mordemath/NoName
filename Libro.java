public class Libro {
    int isbn;
    String titulo;
    int nPag;
    String editorial;
    String autor;
    int ed;
    Boolean estado;

    public Libro(int isbn, String titulo, int nPag, String editorial, String autor, int ed) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.nPag = nPag;
        this.editorial = editorial;
        this.autor = autor;
        this.ed = ed;
        this.estado = true;
    }

    // Getters
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNPag() {
        return nPag;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    public int getEd() {
        return ed;
    }

    public Boolean getEstado() {
        return estado;
    }

    // Setters
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNPag(int nPag) {
        this.nPag = nPag;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}



