import java.util.ArrayList;
import java.util.Comparator;

public class SistemaGestion {

    private ArrayList<Cliente> clientes;
    private ArrayList<Reclamo> reclamos;

    public SistemaGestion() {

        clientes = new ArrayList<>();
        reclamos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarReclamo(Reclamo reclamo) {
        reclamos.add(reclamo);
    }

    public void mostrarClientes() {

        if(clientes.isEmpty()) {

            System.out.println("No hay clientes.");
            return;
        }

        for(Cliente c : clientes) {
            c.mostrarDatos();
        }
    }

    public void mostrarReclamos() {

        if(reclamos.isEmpty()) {

            System.out.println("No hay reclamos.");
            return;
        }

        for(Reclamo r : reclamos) {
            r.mostrarReclamo();
        }
    }

    public Cliente buscarCliente(int id) {

        for(Cliente c : clientes) {

            if(c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public void ordenarClientes() {

        clientes.sort(
            Comparator.comparing(Cliente::getNombre)
        );

        System.out.println("Clientes ordenados.");
    }
}