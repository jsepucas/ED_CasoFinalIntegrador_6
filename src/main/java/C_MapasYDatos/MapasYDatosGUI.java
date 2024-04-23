package C_MapasYDatos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MapasYDatosGUI extends JFrame {
    private GestorMapas gestorMapas;
    private JTextField inputNumero, inputLetra, inputTexto;
    private JTextArea areaResultados;

    public MapasYDatosGUI() {
        super("Gestión de Mapas y Datos");
        gestorMapas = new GestorMapas();
        initComponents();
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
