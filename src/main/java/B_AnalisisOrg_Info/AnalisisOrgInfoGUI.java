package B_AnalisisOrg_Info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AnalisisOrgInfoGUI extends JFrame {
    private Ordenador ordenador;
    private GestorVentas gestorVentas;
    private JTextField inputNombre, inputCliente, inputMonto, inputFecha;
    private DefaultListModel<String> listaNombresModel, listaVentasModel;
    private JList<String> listaNombres, listaVentas;

    public AnalisisOrgInfoGUI() {
        super("Análisis y Organización de Información");
        ordenador = new Ordenador();
        gestorVentas = new GestorVentas();
        initComponents();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // Panel de entrada para nombres y ventas
        JPanel panelEntrada = new JPanel(new GridLayout(2, 1, 5, 5));

        // Panel para la gestión de nombres
        JPanel panelNombres = new JPanel();
        panelNombres.setBorder(BorderFactory.createTitledBorder("Nombres"));
        inputNombre = new JTextField(10);
        JButton botonAgregarNombre = new JButton("Agregar Nombre");
        botonAgregarNombre.addActionListener(e -> agregarNombre());
        panelNombres.add(inputNombre);
        panelNombres.add(botonAgregarNombre);
