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
        super("Gestión de Parejas de Enteros (UAX) @!");
        listaParejas = new ListaDinamica<>();
        modeloLista = new DefaultListModel<>();
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {

        setLayout(new BorderLayout());


        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new GridLayout(3, 2, 5, 5));


        textoPrimerElemento = new JTextField();
        textoSegundoElemento = new JTextField();

        panelEntrada.add(new JLabel("Primer Elemento:"));
        panelEntrada.add(textoPrimerElemento);
        panelEntrada.add(new JLabel("Segundo Elemento:"));
        panelEntrada.add(textoSegundoElemento);


        JButton botonAgregar = new JButton("Agregar");
        JButton botonEliminar = new JButton("Eliminar");
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

        panelEntrada.add(botonAgregar);
        panelEntrada.add(botonEliminar);

        add(panelEntrada, BorderLayout.NORTH);


        lista = new JList<>(modeloLista);
        add(new JScrollPane(lista), BorderLayout.CENTER);
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

    public static void main(String[] args) {
        new InterfazGrafica();
    }
}

