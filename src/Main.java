import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SistemaGestion sistema =
                new SistemaGestion();

        int opcion = 0;

        while(opcion != 7) {

            System.out.println("\n======================");
            System.out.println(" AMARILLONET");
            System.out.println("======================");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Registrar reclamo");
            System.out.println("4. Mostrar reclamos");
            System.out.println("5. Buscar cliente");
            System.out.println("6. Ordenar clientes");
            System.out.println("7. Salir");

            try {

                System.out.print("Opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch(opcion) {

                    case 1 -> {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        
                        System.out.print("Teléfono: ");
                        String telefono = sc.nextLine();
                        
                        System.out.print("DNI: ");
                        String dni = sc.nextLine();
                        
                        System.out.print("Dirección: ");
                        String direccion = sc.nextLine();
                        
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        
                        Cliente cliente =
                                new Cliente(
                                        id,
                                        nombre,
                                        telefono,
                                        dni,
                                        direccion,
                                        email
                                );              }

                    case 2 -> sistema.mostrarClientes();

                    case 3 -> {
                        System.out.print("ID Reclamo: ");
int idReclamo = sc.nextInt();
sc.nextLine();

System.out.print("Descripción: ");
String descripcion = sc.nextLine();

System.out.print("Prioridad (Alta/Media/Baja): ");
String prioridad = sc.nextLine();

Reclamo reclamo =
    new Reclamo(
        idReclamo,
        descripcion,
        "Pendiente",
        prioridad,
        c
    );

                    case 4 -> sistema.mostrarReclamos();

                    case 5 -> {
                        System.out.print(
                                "Ingrese ID: "
                        );

                        int buscar =
                                sc.nextInt();
                        
                        Cliente encontrado =
                                sistema.buscarCliente(
                                        buscar
                                );
                        
                        if(encontrado != null) {

                            encontrado.mostrarDatos();

                        } else {

                            System.out.println(
                                    "Cliente inexistente."
                            );
                        }
                    }

                    case 6 -> sistema.ordenarClientes();

                    case 7 -> System.out.println(
                            "Fin del programa."
                        );

                    default -> System.out.println(
                            "Opción inválida."
                        );
                }

            } catch(InputMismatchException e) {

                System.out.println(
                    "Debe ingresar un número."
                );

                sc.nextLine();
            }
        }

        sc.close();
    }
}