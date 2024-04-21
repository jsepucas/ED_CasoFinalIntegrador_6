package A_GestionDatosDinamicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InterfazGrafica extends JFrame {
    private ListaDinamica<Pareja> listaParejas;
    private DefaultListModel<String> modeloLista;
    private JList<String> lista;
    private JTextField textoPrimerElemento;
    private JTextField textoSegundoElemento;

    public InterfazGrafica() {
        super("Gestión de Parejas de Enteros");
        listaParejas = new ListaDinamica<>();
        modeloLista = new DefaultListModel<>();
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));


        JPanel panelEntrada = new JPanel(new GridLayout(2, 2, 5, 5));
        panelEntrada.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textoPrimerElemento = new JTextField();
        textoSegundoElemento = new JTextField();

        panelEntrada.add(new JLabel("Primer Elemento:"));
        panelEntrada.add(textoPrimerElemento);
        panelEntrada.add(new JLabel("Segundo Elemento:"));
        panelEntrada.add(textoSegundoElemento);
        add(panelEntrada, BorderLayout.NORTH);


        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton botonAgregar = new JButton("Agregar");
        JButton botonEliminar = new JButton("Eliminar");
        JButton botonModificar = new JButton("Modificar");

        botonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarPareja();
            }
        });
        botonEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarPareja();
            }
        });
        botonModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                modificarPareja();
            }
        });

        panelBotones.add(botonAgregar);
        panelBotones.add(botonEliminar);
        panelBotones.add(botonModificar);
        add(panelBotones, BorderLayout.SOUTH);


        lista = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(lista);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        add(scrollPane, BorderLayout.CENTER);
    }

    private void agregarPareja() {
        try {
            int primero = Integer.parseInt(textoPrimerElemento.getText());
            int segundo = Integer.parseInt(textoSegundoElemento.getText());
            Pareja nuevaPareja = new Pareja(primero, segundo);
            listaParejas.agregarElemento(nuevaPareja);
            modeloLista.addElement(nuevaPareja.toString());
            textoPrimerElemento.setText("");
            textoSegundoElemento.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarPareja() {
        int indice = lista.getSelectedIndex();
        if (indice != -1) {
            modeloLista.remove(indice);
            listaParejas.eliminarElemento(listaParejas.obtenerElemento(indice));
        }
    }

    private void modificarPareja() {
        int indice = lista.getSelectedIndex();
        if (indice != -1) {
            try {
                int primero = Integer.parseInt(textoPrimerElemento.getText());
                int segundo = Integer.parseInt(textoSegundoElemento.getText());
                Pareja parejaModificada = new Pareja(primero, segundo);
                listaParejas.getElementos().set(indice, parejaModificada);
                modeloLista.set(indice, parejaModificada.toString());
                textoPrimerElemento.setText("");
                textoSegundoElemento.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una pareja para modificar.", "Ninguna selección", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new InterfazGrafica();
    }
}



