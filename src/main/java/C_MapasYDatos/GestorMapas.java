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
        // De números a letras (ejemplo simple)
        numerosLetras.put(1, 'A');
        numerosLetras.put(2, 'B');
        numerosLetras.put(3, 'C');

        // De números a texto
        numerosTextos.put(1, "uno");
        numerosTextos.put(2, "dos");
        numerosTextos.put(3, "tres");
    }

