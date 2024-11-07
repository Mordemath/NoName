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

    public void Abm() {
        // alta de libros en stock a travez de proveedores y la clase libros
        // se crea nuevos titulos y ejemplares en la bd
        // baja libro(stock)
        // modificar reserva(precio)
        //Se cargan en la bd las nuevas instancias
    }

    public void DatosProveedores(){
        //muestra los datos de los proveedores
    }
    
}
