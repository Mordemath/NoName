public class Proveedores {
    private String telefono; // P-Telefono
    private String nombre; // P-Nombre
    private String email; // P-Email
    private int id; // Id del proveedor
    private String linkProveedor; //Link del proveedor
    // Constructor
    public Proveedores(String link ,String telefono, String nombre, String email, int id) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.linkProveedor = link;
    }

    // Getters y Setters
    public String getTelefono() {
        return this.telefono;
    }

    public int getId() {
        return this.id;
    }
    public String getLinkProvedor() {
        return this.linkProveedor;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLinkProveedor(String link) {
        this.linkProveedor = link;
    }

    @Override
    public String toString() {
        return "Proveedores{" +
                "telefono='" + telefono + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void venderLibro(){
        //metodo de venta del libro
    }
    public void generarReciboDelPedido(){
        //metodo que genera el recibo del pedido
    }

    public void mostrarCatalago(){
        //Metodo de mostrarCatalago
    }
}
