package E_Fondo;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {
    private Image imagen;




    public FondoPanel(String rutaImagen) {
        imagen = new ImageIcon(rutaImagen).getImage();
        this.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo con opacidad reducida para un diseño minimalista
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.70f)); // 50% de opacidad
        g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();
    }
}
