public class Tecnico extends Persona {

    private String especialidad;

    public Tecnico(int id,
                   String nombre,
                   String telefono,
                   String especialidad) {

        super(id, nombre, telefono);

        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarDatos() {

        System.out.println("-------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}