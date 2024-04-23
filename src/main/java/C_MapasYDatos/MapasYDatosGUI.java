package C_MapasYDatos;

import javax.swing.*;
import java.awt.*;

public class MapasYDatosGUI extends JFrame {
    private GestorMapas gestorMapas;
    private JTextField inputNumero, inputLetra, inputTexto;
    private JTextArea areaResultados;

    public MapasYDatosGUI() {
        super("Gestión de Mapas y Datos");
        gestorMapas = new GestorMapas();
        initComponents();
        setSize(800, 600); // Cambiar el tamaño de la ventana
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        JPanel panelEntrada = new JPanel(new GridLayout(3, 2, 5, 5));

        inputNumero = new JTextField();
        inputLetra = new JTextField();
        inputTexto = new JTextField();

        panelEntrada.add(new JLabel("Número:"));
        panelEntrada.add(inputNumero);
        panelEntrada.add(new JLabel("Letra:"));
        panelEntrada.add(inputLetra);
        panelEntrada.add(new JLabel("Texto:"));
        panelEntrada.add(inputTexto);

        add(panelEntrada, BorderLayout.NORTH);

        JButton botonAgregarLetra = new JButton("Agregar Letra");
        JButton botonAgregarTexto = new JButton("Agregar Texto");
        JButton botonRecuperar = new JButton("Recuperar Datos");

        botonAgregarLetra.addActionListener(e -> agregarLetra());
        botonAgregarTexto.addActionListener(e -> agregarTexto());
        botonRecuperar.addActionListener(e -> recuperarDatos());

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(botonAgregarLetra);
        panelBotones.add(botonAgregarTexto);
        panelBotones.add(botonRecuperar);
        add(panelBotones, BorderLayout.CENTER);

        areaResultados = new JTextArea(10, 20);
        areaResultados.setEditable(false);
        add(new JScrollPane(areaResultados), BorderLayout.SOUTH);
    }

    private void agregarLetra() {
        String numeroStr = inputNumero.getText();
        String letraStr = inputLetra.getText();
        if (numeroStr.matches("\\d+") && letraStr.length() == 1) {
            int numero = Integer.parseInt(numeroStr);
            char letra = letraStr.charAt(0);
            gestorMapas.agregarRelacionNumeroLetra(numero, letra);
            areaResultados.append("Agregada relación: " + numero + " -> " + letra + "\n");
            inputNumero.setText("");
            inputLetra.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Asegúrese de ingresar un número válido y una sola letra.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarTexto() {
        String numeroStr = inputNumero.getText();
        String texto = inputTexto.getText();
        if (numeroStr.matches("\\d+") && !texto.isEmpty()) {
            int numero = Integer.parseInt(numeroStr);
            gestorMapas.agregarRelacionNumeroTexto(numero, texto);
            areaResultados.append("Agregada relación texto: " + numero + " -> " + texto + "\n");
            inputNumero.setText("");
            inputTexto.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido y un texto no vacío.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void recuperarDatos() {
        String numeroStr = inputNumero.getText();
        if (numeroStr.matches("\\d+")) {
            int numero = Integer.parseInt(numeroStr);
            char letra = gestorMapas.obtenerLetraDeNumero(numero);
            String texto = gestorMapas.obtenerTextoDeNumero(numero);
            areaResultados.append("Recuperado para " + numero + ": Letra -> " + letra + ", Texto -> " + texto + "\n");
            inputNumero.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new MapasYDatosGUI();
    }
}
