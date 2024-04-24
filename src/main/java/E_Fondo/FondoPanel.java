package E_Fondo;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel(String rutaImagen, int ancho, int alto) {
        imagen = new ImageIcon(rutaImagen).getImage();
        imagen = imagen.getScaledInstance(700,600 , Image.SCALE_SMOOTH);
        this.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.83f));
        g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        g2d.dispose();

        //
    }
}