public class GestionStock {
    private int cantidadLibros; // G-Cantidad de Libros
    private int codigoDescuento; // G-Código descuento
    // Constructor
    public GestionStock(int cantidadLibros, int codigoDescuento) {
        this.cantidadLibros = cantidadLibros;
        this.codigoDescuento = codigoDescuento;
    }

    // Getters y Setters
    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public int getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(int codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public void GenerarInforme() {
        // accede a la base de datos
        // Genera informe
    }

    public void Notificaciónes() {
        // envía notificaciónes al bibliotecario sobre stock bajo, cuando se acreditan
        // la compras y guardan en stock
    }


}
