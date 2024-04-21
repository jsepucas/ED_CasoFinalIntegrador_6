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
}
