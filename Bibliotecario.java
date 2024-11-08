import java.time.LocalDateTime;

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
        this.setEstado(false);
        // Se vuelve al main************
    }

    public void pedirReserva() {
        // Se accede al catalogo
        // Se seleccióna el libro
        // se comunica con gestión de stock para ver si el libro está disponible
        // se crea una nueva reserva
        // notificación
    }

    public void VerReservas() {
        // Se accede a las reservas y se extraen las del usuario
    }

    public void CancelarReserva() {
        // Se accede a ver reservas
        // Se seleccióna la reserva
        // se setea el estado de la reserva a false
    }

    public void  cobraPago() {
        // se ingresan los datos de la tarjeta
        // Pagar
    }
    public void gestionDeCaja(){
        //Este metodo se usa para ver todos los datos de las cajas echas (Consultas)
    }

    public void SolicitarInformes(){
        // Se accede a gestión de stock
    }
    public void abmLibros(){
        // Se accede a la clase libros y se crean, modifican o eliminan instancias
        //se cargan en la Bd por medio de Gestión de stock
    }

}
