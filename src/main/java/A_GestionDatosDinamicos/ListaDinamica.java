package A_GestionDatosDinamicos;

import java.util.ArrayList;
public class ListaDinamica <T>  {

    private ArrayList<T> elementos;

    public ListaDinamica() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }
}
