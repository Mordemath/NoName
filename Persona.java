public class Persona {
    private String nombre;
    private String correo;
    private int telefono;
    private int id;

    // Constructor
    Persona(){}
    
    Persona(int telefono, String nombre, String correo, int id) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
    }

    // Métodos set
    public void setTelefono(int telefono) {
        this.telefono = telefono; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public void setCorreo(String correo) {
        this.correo = correo; 
    }

    public void setId(int id) {
        this.id = id; 
    }

    // Métodos get
    public String getNombre() {
        return this.nombre; // Retorna el nombre de la persona
    }

    public String getCorreo() {
        return this.correo; // Retorna el correo de la persona
    }

    public int getTelefono() {
        return this.telefono; // Retorna el teléfono de la persona
    }

    public int getId() {
        return this.id; // Retorna el ID de la persona
    }
}