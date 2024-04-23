package D_IndexYVisualArch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ArchivosGUI extends JFrame {
    private IndexadorArchivos indexador;
    private JTextField inputRuta;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaArchivos;

    public ArchivosGUI() {
        super("Indexación y Visualización de Archivos");
        indexador = new IndexadorArchivos();
        initComponents();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        JPanel panelEntrada = new JPanel(new BorderLayout());
        inputRuta = new JTextField(30);
        JButton botonIndexar = new JButton("Indexar Directorio");
        botonIndexar.addActionListener(this::accionIndexar);


        panelEntrada.add(inputRuta, BorderLayout.CENTER);
        panelEntrada.add(botonIndexar, BorderLayout.EAST);
        add(panelEntrada, BorderLayout.NORTH);

        modeloLista = new DefaultListModel<>();
        listaArchivos = new JList<>(modeloLista);
        add(new JScrollPane(listaArchivos), BorderLayout.CENTER);

        JButton botonOrdenar = new JButton("Ordenar Archivos");
        botonOrdenar.addActionListener(e -> ordenarArchivos());
        add(botonOrdenar, BorderLayout.SOUTH);
    }

    private void accionIndexar(ActionEvent e) {
        String ruta = inputRuta.getText().trim();
        if (!ruta.isEmpty()) {
            indexador.indexarDirectorio(ruta);
            modeloLista.clear();
            for (String archivo : indexador.getListaArchivos()) {
                modeloLista.addElement(archivo);
            }
        }
    }

    private void ordenarArchivos() {
        indexador.ordenarArchivos();
        modeloLista.clear();
        for (String archivo : indexador.getListaArchivos()) {
            modeloLista.addElement(archivo);
        }
    }

    public static void main(String[] args) {
        new ArchivosGUI();
    }
}



