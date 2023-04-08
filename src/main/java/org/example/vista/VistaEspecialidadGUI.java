package org.example.vista;

import javax.swing.*;

public class VistaEspecialidadGUI extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JButton btnNuevo;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxClave;
    private JLabel lbClave;
    public JTextField jtxNombre;
    private JLabel lbNombre;

    public VistaEspecialidadGUI() {
        setTitle("Catalogo de Especialidades");
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(435, 140);
        this.jtxClave.setText("1");
        this.jtxNombre.setText("Programación");
        setVisible(true);
    }
}
