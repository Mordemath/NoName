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
        System.out.println("Informe: existen " + cantidadLibros + " libros en stock.");
    }

    public void Notificaciónes() {
        if (cantidadLibros < 5) System.out.println("Alerta: stock bajo.");
        else System.out.println("Stock suficiente.");
    }


}
