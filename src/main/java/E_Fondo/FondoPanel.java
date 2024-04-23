package E_Fondo;

import javax.swing.*;
import java.awt.*;

public class FondoPanel extends JPanel {
    private Image imagen;

    public FondoPanel(String rutaImagen) {
        imagen = new ImageIcon(rutaImagen).getImage();
    }
