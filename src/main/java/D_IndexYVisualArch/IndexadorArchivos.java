package D_IndexYVisualArch;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IndexadorArchivos {
    private List<String> listaArchivos;

    public IndexadorArchivos() {
        listaArchivos = new ArrayList<>();
    }


    public void indexarDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        if (directorio.exists()) {
            indexarDirectorioRecursivo(directorio);
        } else {
            System.out.println("El directorio no existe.");
        }
    }