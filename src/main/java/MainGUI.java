
//Imports
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;

import A_GestionDatosDinámicos.InterfazGrafica;
import B_AnalisisOrg_Info.AnalisisOrgInfoGUI;
import C_MapasYDatos.MapasYDatosGUI;
import D_IndexYVisualArch.ArchivosGUI;

// -------------------------Clase MainGUI-------------------------
public class MainGUI extends JFrame {

    public MainGUI() {

        super("Sistema de Gestión y Análisis de Datos Multidimensionales de la UAX");
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

//-------------------------Código de la aplicación principal-------------------------

    private void initComponents() {

        //Layout para organizar los botones de manera uniforme.

        setLayout(new GridLayout(2, 5, 10, 10)); // GridLayout para organizar los botones de manera uniforme.


//-------------------------------------------------------------------------------------------------------------------------------

        //Creación de los botones para cada módulo de la aplicación. (A, B, C, D)
        JButton btnModuloA = new JButton("Gestión de Datos Dinámicos");
        JButton btnModuloB = new JButton("Análisis y Organización de Información");
        JButton btnModuloC = new JButton("Mapas y Asociación de Datos");
        JButton btnModuloD = new JButton("Indexación y Visualización de Archivos");

           //Asignación de acciones a los botones.
        btnModuloA.addActionListener(e -> new InterfazGrafica().setVisible(true));
        btnModuloB.addActionListener(e -> new AnalisisOrgInfoGUI().setVisible(true));
        btnModuloC.addActionListener(e -> new MapasYDatosGUI().setVisible(true));
        btnModuloD.addActionListener(e -> new ArchivosGUI().setVisible(true));

        //Añadir los botones al contenedor principal.

        add(btnModuloA);
        add(btnModuloB);
        add(btnModuloC);
        add(btnModuloD);
    }

    //-------------------------Método principal-------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainGUI::new);
    }
}

