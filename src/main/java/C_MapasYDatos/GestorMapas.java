package C_MapasYDatos;
import java.util.HashMap;
import java.util.Map;

public class GestorMapas {
    private Map<Integer, Character> numerosLetras;
    private Map<Integer, String> numerosTextos;

    public GestorMapas() {
        numerosLetras = new HashMap<>();
        numerosTextos = new HashMap<>();
        inicializarDatos();
    }

    private void inicializarDatos() {
        // De números a letras
        numerosLetras.put(1, 'A');
        numerosLetras.put(2, 'B');
        numerosLetras.put(3, 'C');

        // De números a texto
        numerosTextos.put(1, "uno");
        numerosTextos.put(2, "dos");
        numerosTextos.put(3, "tres");
    }

    public void agregarRelacionNumeroLetra(int numero, char letra) {
        numerosLetras.put(numero, letra);
    }

    public void agregarRelacionNumeroTexto(int numero, String texto) {
        numerosTextos.put(numero, texto);
    }

    public char obtenerLetraDeNumero(int numero) {
        return numerosLetras.getOrDefault(numero, '?'); // Devuelve '?' si el número no está asociado.
    }

    public String obtenerTextoDeNumero(int numero) {
        return numerosTextos.getOrDefault(numero, "desconocido"); // Devuelve "desconocido" si no hay correspondencia.
    }
}



