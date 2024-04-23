//Imports
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;

import A_GestionDatosDinámicos.InterfazGrafica;
import B_AnalisisOrg_Info.AnalisisOrgInfoGUI;
import C_MapasYDatos.MapasYDatosGUI;
import D_IndexYVisualArch.ArchivosGUI;
import E_Fondo.FondoPanel;

// -------------------------Clase MainGUI-------------------------
public class MainGUI extends JFrame {

    public MainGUI() {

        super("Sistema de Gestión y Análisis de Datos Multidimensionales de la UAX  \uD83D\uDCCA ");
        initComponents();
        setSize(1020, 710);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

//-------------------------Código de la aplicación principal-------------------------

    private void initComponents() {
        //---------------------------------------------------------------//  Para editar el fondo???

        FondoPanel fondoPanel = new FondoPanel("src/main/resources/Logo.png");
        fondoPanel.setLayout(new BorderLayout());

        JLabel imagenEmpresa = new JLabel(new ImageIcon("src/main/resources/Logo.png"));
        fondoPanel.add(imagenEmpresa, BorderLayout.NORTH);


        //Layout para organizar los botones de manera uniforme?

//-------------------------------------------------------------------------------------------------------------------------------

        //Declaración de los gbc's
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

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



        //----------------------Configuración de los gbc's para cada botón.---------------------------
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 15, 15);
        add(btnModuloA, gbc);

        gbc.gridx = 3;
        add(btnModuloB, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Restablece gridwidth a 1 para los siguientes botones
        add(btnModuloC, gbc);

        gbc.gridx = 3;
        add(btnModuloD, gbc);


        //-------------------------Añadir el panel de fondo al contenedor principal.-------------------------

        add(fondoPanel);
    }

    //-------------------------Método principal-------------------------

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainGUI::new);
    }
}

