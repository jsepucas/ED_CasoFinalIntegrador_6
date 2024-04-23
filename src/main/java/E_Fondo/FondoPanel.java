package E_Fondo;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel(String  rutaImagen) {
        imagen = new ImageIcon(rutaImagen).getImage();
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JLabel imagenEmpresa = new JLabel(new ImageIcon(imagen));
        imagenEmpresa.setHorizontalAlignment(JLabel.LEFT);
        imagenEmpresa.setVerticalAlignment(JLabel.TOP);
        add(imagenEmpresa, BorderLayout.NORTH);

        JLabel sgadmLabel = new JLabel("S.G.A.D.M");
        JLabel sgadmMeaningLabel = new JLabel("Sistema de Gestión y Análisis de Datos Multidimensionales");
        JPanel sgadmPanel = new JPanel(new GridLayout(2, 1));
        sgadmPanel.add(sgadmLabel);
        sgadmPanel.add(sgadmMeaningLabel);
        add(sgadmPanel, BorderLayout.SOUTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}