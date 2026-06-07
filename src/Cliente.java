public class Cliente extends Persona {

    private String dni;
    private String direccion;
    private String email;

    public Cliente(
            int id,
            String nombre,
            String telefono,
            String dni,
            String direccion,
            String email) {

        super(id, nombre, telefono);

        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("-------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Email: " + email);
    }
}