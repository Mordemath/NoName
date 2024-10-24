public class Usuario extends Persona {
    private String contrasena;
    private Boolean cuentaActiva;

    // Constructor
    Usuario() {
        this.cuentaActiva = true;
    }

    // Método set para contrasena
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    private String getContrasena() {
        return this.contrasena;
    }

    private Boolean getEstadoCuenta() {
        return this.cuentaActiva;
    }

    static public void altaCuenta() {
        // Acá un metodo para dar de alta una cuenta de usuario*******
        // menu de crear cuenta Caso de uso Alta usuario
        // Usuario usuario = new Usuario(123456789 , "Juan", "juan@gmail.com", "1234");
    }

    public void ConfiguraciónUsuario() {
        // menu de configuración de usuario
        // Alta (Acceso a los set)
        // Baja (se modifica el estado)
        bajaUsuario();
        // Modificar(acceso a los set)
        // Mostrar usuario
    }

    public void MostrarUsuario() {
        // Accede a los get
    }

    public void ModificarUsuario() {
        // acceso a los set
    }

    private void bajaUsuario() {
        this.cuentaActiva = false;
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
        // Se accede a las reservas y se estraen las del usuario
    }

    public void CancelarReserva() {
        // Se accede a ver reservas
        // Se seleccióna la reserva
        // se setea el estado de la reserva a false
    }

    public void Pagar() {
        // se ingresan los datos de la tarjeta
        // Pagar
    }

    public void VerCatalogo() {
        // Se accede al catalogo
    }
}