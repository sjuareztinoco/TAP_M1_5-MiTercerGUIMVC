package org.example.controlador;

import org.example.dao.DAOEspecialidad;
import org.example.modelo.ModeloEspecialidad;
import org.example.vista.VistaEspecialidadGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEspecialidadGUI implements ActionListener {
    private final ModeloEspecialidad modelo;
    private final VistaEspecialidadGUI vista;

    public ControladorEspecialidadGUI(ModeloEspecialidad modelo, VistaEspecialidadGUI vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnNuevo == evento.getSource()) {
            clear();
        }
        else if(vista.btnGuardar == evento.getSource()) {
            modelo.setId(
                Integer.parseInt(vista.jtxClave.getText())
            );
            modelo.setNombre(vista.jtxNombre.getText());
            DAOEspecialidad dao = new DAOEspecialidad();
            if(dao.agregar(modelo)) {
                JOptionPane.showMessageDialog(
                    null,
                    "Registro Guardado!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }else {
                JOptionPane.showMessageDialog(
                    null,
                    "Ups! Fallo al intentar agregar especialidad.\n" +
                            "Intente nuevamente.",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            clear();
        }
        else if(vista.btnSalir == evento.getSource()){
            Salir();
        }
    }

    public void clear(){
        this.vista.jtxClave.setText("");
        this.vista.jtxNombre.setText("");
    }

    public void Salir(){
        System.exit(0);
    }
}
