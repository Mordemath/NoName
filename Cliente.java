import java.time.LocalDateTime;

public class Cliente {
    private String nombre; // C-Nombre
    private String contrasena; // C-Contraseña
    private LocalDateTime fechaCreacion; // C-Fecha de creación
    private Boolean estado; // C-Estado true activo, false dado de baja
    private String gmail; // C-Gmail
    private String rol; // C-Rol
    private int id; // C-Id
    private int telefono; // C-Telefono (opcional)
   
    // Constructor
    public Cliente(String nombre, String contrasena, LocalDateTime fechaCreacion, String gmail, int id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fechaCreacion = fechaCreacion;
        this.estado = true;
        this.gmail = gmail;
        this.rol = "Cliente";
        this.id = id;
    }
    // Getters y Setters************************************************************************************************
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void bajaUsuario() {
        estado = false;
        System.out.println("Cliente " + id + " dado de baja.");
    }
    public void modificarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuevo nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Nuevo Gmail: ");
        this.gmail = sc.nextLine();
        System.out.println("Perfil actualizado: " + nombre + ", " + gmail);
    }

    public void pedirReserva() {
        // Se accede al catalogo
        // Se seleccióna el libro
        // se comunica con gestión de stock para ver si el libro está disponible
        // se crea una nueva reserva
        // notificación
    }

    public void VerReservas() {
        // Se accede a las reservas y se estraen las del usuario
    }

    public void CancelarReserva() {
        // Se accede a ver reservas
        // Se seleccióna la reserva
        // se setea el estado de la reserva a false
    }

    public void realizarPago() {
        // se ingresan los datos de la tarjeta
        // Pagar
    }
    public void buscarLibro(){
        //Metodo para buscar libros
    }
    public void recibirNotificaciones(){
        //metodo que hacer que el usuario reciba notificaciones
    }
}
