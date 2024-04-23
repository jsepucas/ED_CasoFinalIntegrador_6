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
