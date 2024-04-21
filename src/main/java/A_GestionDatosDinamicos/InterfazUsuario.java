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
}
