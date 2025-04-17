import java.time.LocalDateTime;
import java.util.Scanner;
public class Bibliotecario {
    private String nombre; // B-Nombre
    private String contraseña; // B-Contraseña
    private LocalDateTime fechaCreacion; // B-Fecha de creación
    private Boolean estado; // B-Estado true activo, false dado de baja
    private String gmail; // B-Gmail
    private String rol; // B-Rol
    private int id; // B-Id
    private String telefono; // B-Teléfono (opcional)
    private String horarios; // B-Horarios

    // Constructor
    public Bibliotecario(String nombre, String contrasena, LocalDateTime fechaCreacion, String gmail, int id) {
        this.nombre = nombre;
        this.contraseña = contrasena;
        this.fechaCreacion = fechaCreacion;
        this.estado = true;
        this.gmail = gmail;
        this.rol = "Bibliotecario";
        this.id = id;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void bajaUsuario() {
        if (!estado) System.out.println("Usuario " + id + " ya dado de baja.");
            else {
                estado = false;
                System.out.println("Usuario " + id + " dado de baja con éxito.");
            }
    }
    public void modificarUsuario(){ //Pide los datos y los modifica despues en la base de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuevo nombre: "); 
        this.nombre = sc.nextLine();
        System.out.print("Nuevo Gmail: "); 
        this.gmail = sc.nextLine();
        System.out.print("Nuevo telefono: "); 
        this.telefono = sc.nextLine();
        System.out.println("Datos actualizados: " + nombre + ", " + gmail + ", " + telefono);
    }

    public void pedirReserva() { // Scanea el id y se realiza la reserva si esta disponible
        Scanner sc = new Scanner(System.in);
        System.out.print("ID libro a reservar: ");
        int libroId = sc.nextInt();
        if (GestionStock.estaDisponible(libroId)) {
            Reserva reserva = new Reserva(libroId, 0.0, LocalDateTime.now(), LocalDateTime.now().plusDays(7));
            System.out.println("Reserva creada. Detalles:");
            reserva.ticketReserva();
            GestionStock.decrementar(libroId);
        } else System.out.println("Libro " + libroId + " no disponible.");
    }

    public void VerReservas() {
        System.out.println("Mostrando reservas almacenadas en memoria.");
    }

    public void CancelarReserva() { //Metodo de cancelar la reserva
        Scanner sc = new Scanner(System.in);
        System.out.print("ID reserva a cancelar: "); 
        int resId = sc.nextInt();
        System.out.println("Reserva " + resId + " cancelada (simulado). ");
    }

    public void  cobraPago() { //Ingresa el ID para realizar la reserva
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese ID reserva para cobro: ");
        int resId = sc.nextInt();
        System.out.print("Monto a cobrar: "); 
        double monto = sc.nextDouble();
        Transacciones tx = new Transacciones(monto, LocalDateTime.now(), resId);
        tx.imprimirFactura();
        tx.descargarPago();
    }
    public void gestionDeCaja() {
        System.out.println("Generando resumen de caja (simulado)...");
    }

    public void SolicitarInformes() {
        GestionStock gs = new GestionStock(0, 0);
        gs.GenerarInforme();
    }
      public void abmLibros() {
        System.out.println("ABM de libros (crear/modificar/eliminar - simulado).");
    }

    public void RealizarPago() {
        System.out.println("Pago a proveedores realizado (simulado).");
    }

    public void BuscarLibro() { //logica para buscar un libro
        Scanner sc = new Scanner(System.in);
        System.out.print("Criterio busqueda: "); 
        String criterio = sc.nextLine();
        System.out.println("Resultados de busqueda (simulado) para: " + criterio);
    }

    public void contactarProveedores() {
        Proveedores p = new Proveedores("www.link", "12345", "Proveedor1", "prov@dominio", 1);
        p.mostrarCatalogo();
    }

    public void GestionDeCaja() {
        System.out.println("Cierre de caja diario (simulado)");
    }
}
