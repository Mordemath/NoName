import java.util.Date;

public class GestionDeStock {
    int nLibros;//Titulos disponibles
    int cantLibros;//Cantidad de libros en total
    Date fechaActual;

    // Constructor para inicializar la fecha actual
    public GestionDeStock() {
        this.fechaActual = new Date();
    }

     // Métodos get
     public int getnLibros() {
        return this.nLibros;
    }

    public int getCantLibros() {
        return this.cantLibros;
    }

    public Date getFechaActual() {
        return this.fechaActual;
    }
    // Métodos set
    public void setnLibros(int a) {
        this.nLibros = this.nLibros + a;
    }

    public void setCantLibros(int a) {
        this.cantLibros = this.cantLibros + a;
    }
    public void GenerarInforme(){
        //accede a la base de datos 
        //Genera informe 
    }
    public void Notificaciónes(){
        //envía notificaciónes al bibliotecario sobre stock bajo, cuando se acreditan la compras y guardan en stock
    }
    public void AltaLibro(){
        //alta de libros en stock a travez de proveedores
        //se crea nuevos titulos y ejemplares en la bd
        //baja libro(stock)
        //modificar reserva(precio)
    }
}
