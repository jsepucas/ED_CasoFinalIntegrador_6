package A_GestionDatosDinámicos;

import java.util.ArrayList;
public class ListaDinamica <T>  {

    private ArrayList<T> elementos;

    public ListaDinamica() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public boolean eliminarElemento(T elemento) {
        return elementos.remove(elemento);
    }

    public T obtenerElemento(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return elementos.get(indice);
    }

    public ArrayList<T> getElementos() {
        return new ArrayList<>(elementos);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }

}
