import javax.swing.*;
import java.awt.*;

import A_GestionDatosDinámicos.InterfazGrafica;
import B_AnalisisOrg_Info.AnalisisOrgInfoGUI;
import C_MapasYDatos.MapasYDatosGUI;
import D_IndexYVisualArch.ArchivosGUI;

public class MainGUI extends JFrame {
    public MainGUI() {
        super("Aplicación Principal - Sistema de Gestión");
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new GridLayout(2, 2, 10, 10)); // GridLayout para organizar los botones de manera uniforme.

        // Botón para el módulo A - Gestión de Datos Dinámicos
        JButton btnModuloA = new JButton("Gestión de Datos Dinámicos");
        btnModuloA.addActionListener(e -> new InterfazGrafica().setVisible(true));

        // Botón para el módulo B - Análisis y Organización de Información
        JButton btnModuloB = new JButton("Análisis y Organización de Información");
        btnModuloB.addActionListener(e -> new AnalisisOrgInfoGUI().setVisible(true));

        // Botón para el módulo C - Mapas y Asociación de Datos
        JButton btnModuloC = new JButton("Mapas y Asociación de Datos");
        btnModuloC.addActionListener(e -> new MapasYDatosGUI().setVisible(true));

        // Botón para el módulo D - Indexación y Visualización de Archivos
        JButton btnModuloD = new JButton("Indexación y Visualización de Archivos");
        btnModuloD.addActionListener(e -> new ArchivosGUI().setVisible(true));

        add(btnModuloA);
        add(btnModuloB);
        add(btnModuloC);
        add(btnModuloD);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainGUI::new);
    }
}