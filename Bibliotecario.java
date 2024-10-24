public class Bibliotecario extends Persona {
    private String contrasena;
    private String direccion;
    private Boolean cuentaActiva;

    Bibliotecario(int telefono, String nombre, String correo, String contrasena, int id, String direccion) {
        super(telefono, nombre, correo, id);
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    // Métodos get para los atributos de Bibliotecario
    public String getContrasena() {
        return this.contrasena; // Retorna la contraseña del bibliotecario
    }

    public String getDireccion() {
        return this.direccion; // Retorna la dirección del bibliotecario
    }

    // Métodos set para los atributos de Bibliotecario
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena; // Establece la contraseña del bibliotecario
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion; // Establece la dirección del bibliotecario
    }
    
    public Boolean getEstadoCuenta() {
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
    }

    public void ModificarUsuario() {
        // acceso a los set
    }

    private void bajaUsuario() {
        this.cuentaActiva = false;
        // Se vuelve al main************
    }
}