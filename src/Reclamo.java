public class Reclamo {

    private int idReclamo;
    private String descripcion;
    private String estado;
    private String prioridad;
    private Cliente cliente;

    public Reclamo(
            int idReclamo,
            String descripcion,
            String estado,
            String prioridad,
            Cliente cliente) {

        this.idReclamo = idReclamo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.cliente = cliente;
    }

    public int getIdReclamo() {
        return idReclamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void mostrarReclamo() {

        System.out.println("-------------------------");
        System.out.println("ID Reclamo: " + idReclamo);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + estado);
        System.out.println("Prioridad: " + prioridad);
    }
}