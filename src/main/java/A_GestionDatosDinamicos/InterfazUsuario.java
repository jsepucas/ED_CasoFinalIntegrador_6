package A_GestionDatosDinamicos;

import java.util.Scanner;
public class InterfazUsuario {

    private ListaDinamica<Pareja> listaParejas;

    public InterfazUsuario() {
        listaParejas = new ListaDinamica<>();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar Pareja\n2. Eliminar Pareja\n3. Mostrar Parejas\n4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer elemento: ");
                    int primero = scanner.nextInt();
                    System.out.print("Ingrese el segundo elemento: ");
                    int segundo = scanner.nextInt();
                    listaParejas.agregarElemento(new Pareja(primero, segundo));
                    break;

                case 2:
                    System.out.print("Ingrese el índice de la pareja a eliminar: ");
                    int indice = scanner.nextInt();
                    try {
                        Pareja eliminada = listaParejas.obtenerElemento(indice);
                        listaParejas.eliminarElemento(eliminada);
                        System.out.println("Pareja eliminada: " + eliminada);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Lista de Parejas: " + listaParejas);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
}
