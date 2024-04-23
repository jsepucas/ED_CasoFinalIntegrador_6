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

