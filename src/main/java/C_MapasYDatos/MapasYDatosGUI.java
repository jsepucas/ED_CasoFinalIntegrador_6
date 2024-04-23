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

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));

        inputNumero = new JTextField();
        inputLetra = new JTextField();
        inputTexto = new JTextField();
        JButton botonAgregarLetra = new JButton("Agregar Letra");
        JButton botonAgregarTexto = new JButton("Agregar Texto");
        JButton botonRecuperar = new JButton("Recuperar Datos");

        botonAgregarLetra.addActionListener(e -> agregarLetra());
        botonAgregarTexto.addActionListener(e -> agregarTexto());
        botonRecuperar.addActionListener(e -> recuperarDatos());

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonAgregarLetra);
        panelBotones.add(botonAgregarTexto);
        panelBotones.add(botonRecuperar);
        add(panelBotones, BorderLayout.CENTER);

        areaResultados = new JTextArea(10, 20);
        areaResultados.setEditable(false);
        add(new JScrollPane(areaResultados), BorderLayout.SOUTH);
    }

    private void agregarLetra() {
        try {
            int numero = Integer.parseInt(inputNumero.getText());
            char letra = inputLetra.getText().charAt(0);
            gestorMapas.agregarRelacionNumeroLetra(numero, letra);
            areaResultados.append("Agregada relación: " + numero + " -> " + letra + "\n");
            inputNumero.setText("");
            inputLetra.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la entrada de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
