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

    public boolean indexarDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        if (directorio.exists() && directorio.isDirectory()) {
            indexarDirectorioRecursivo(directorio);
            return true;
        } else {
            return false;
        }
    }

    private void indexarDirectorioRecursivo(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    listaArchivos.add(archivo.getAbsolutePath());
                } else if (archivo.isDirectory()) {
                    indexarDirectorioRecursivo(archivo);
                }
            }
        }
    }
    public List<String> getListaArchivos() {
        return listaArchivos;
    }

    public void ordenarArchivos() {
    }
}