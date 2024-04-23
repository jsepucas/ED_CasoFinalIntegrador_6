package B_AnalisisOrg_Info;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenador {
    public static void ordenarNombres(ArrayList<String> lista) {
        Collections.sort(lista);
    }
    public static int buscarNombre(ArrayList<String> lista, String nombre) {
        return Collections.binarySearch(lista, nombre);
    }
}
