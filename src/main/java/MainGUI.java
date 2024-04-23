//Imports
import javax.swing.*;
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
        FondoPanel fondoPanel = new FondoPanel("src/main/resources/6.gif");
        setContentPane(fondoPanel);
        fondoPanel.setLayout(new BorderLayout());


        // Panel para los botones en el lado izquierdo
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false); // Panel transparente para mostrar el fondo




//-------------------------------------------------------------------------------------------------------------------------------

        //Creación de los botones para cada módulo de la aplicación. (A, B, C, D)
        addButton("A. Gestión de Datos Dinámicos", InterfazGrafica.class, buttonPanel);
        addButton("B. Análisis y Organización de Información", AnalisisOrgInfoGUI.class, buttonPanel);
        addButton("C. Mapas y Asociación de Datos", MapasYDatosGUI.class, buttonPanel);
        addButton("D. Indexación y Visualización de Archivos", ArchivosGUI.class, buttonPanel);

        // Agregar el panel de botones al lado izquierdo
        fondoPanel.add(buttonPanel, BorderLayout.WEST);


        // Agregar logo al lado derecho
        JLabel imagenEmpresa = new JLabel(new ImageIcon("src/main/resources/AlfonsoXSabio.png"));
        fondoPanel.add(imagenEmpresa, BorderLayout.NORTH);
    }

    private void addButton(String text, Class<? extends JFrame> frameClass, JPanel panel) {
        JButton button = new JButton(text);
        button.addActionListener(e -> {
            try {
                JFrame frame = frameClass.getDeclaredConstructor().newInstance();
                frame.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciado entre botones
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainGUI::new);
    }
}