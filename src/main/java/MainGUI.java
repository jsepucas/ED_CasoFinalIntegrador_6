import javax.swing.*;
import java.awt.*;

import A_GestionDatosDinámicos.InterfazGraficaGUI;
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
