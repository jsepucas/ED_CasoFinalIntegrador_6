package D_IndexYVisualArch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ArchivosGUI extends JFrame {
    private IndexadorArchivos indexador;
    private JTextField inputRuta;
    private DefaultListModel<String> modeloLista;
    private JList<String> listaArchivos;