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

        // panel con fondo de imagen
        FondoPanel fondoPanel = new FondoPanel("src/main/resources/6.gif", 10, 30 );
        setContentPane(fondoPanel);
        fondoPanel.setLayout(new BorderLayout());


        // Panel para los botones con FlowLayout para centrarlos y tamaño fijo

        JPanel buttonPanelContainer = new JPanel(new FlowLayout(FlowLayout.CENTER, 2000, 20));
        buttonPanelContainer.setOpaque(false);


        // Panel para los botones con BoxLayout para alinearlos verticalmente y tamaño fijo

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false);

        buttonPanel.setMaximumSize(new Dimension(300, buttonPanel.getPreferredSize().height));


//-------------------------------------------------------------------------------------------------------------------------------

        //Creación de los botones para cada módulo de la aplicación. (A, B, C, D)
        addButton("A. Gestión de Datos Dinámicos         ", InterfazGrafica.class, buttonPanel);
        addButton("         B. Análisis y Organización de Información", AnalisisOrgInfoGUI.class, buttonPanel);
        addButton("C. Mapas y Asociación de Datos        ", MapasYDatosGUI.class, buttonPanel);
        addButton("          D. Indexación y Visualización de Archivos", ArchivosGUI.class, buttonPanel);

        // Agregar el panel de botones al lado izquierdo
        buttonPanelContainer.add(buttonPanel);
        fondoPanel.add(buttonPanelContainer, BorderLayout.CENTER);


        // Agregar logo al lado derecho
        JLabel imagenEmpresa = new JLabel(new ImageIcon(new ImageIcon("src/main/resources/AlfonsoXSabio.png").getImage().getScaledInstance(620, 220, Image.SCALE_SMOOTH)));
        fondoPanel.add(imagenEmpresa, BorderLayout.NORTH);

        JLabel imagenEsquina = new JLabel(new ImageIcon(new ImageIcon("src/main/resources/UAX2.png").getImage().getScaledInstance(125,68, Image.SCALE_SMOOTH)));
        fondoPanel.add(imagenEsquina, BorderLayout.PAGE_END);



    }

    //Método para crear botones-----------------------------------------------------------------------------------------------
    private void addButton(String text, Class<? extends JFrame> frameClass, JPanel panel) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(0, 92, 169, 120));
        button.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        button.setPreferredSize(new Dimension(0, 65) );
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE,1200   )); // Ajuste clave aquí

        button.setPreferredSize(new Dimension(550, 65));
        button.setMaximumSize(new Dimension(550, 65));

        button.addActionListener(e -> {
            try {
                JFrame frame = frameClass.getDeclaredConstructor().newInstance();
                frame.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        button.setAlignmentX(Component.TOP_ALIGNMENT);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaciado entre botones
    }


    //Método main para ejecutar la aplicación : )
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainGUI::new);
    }
}