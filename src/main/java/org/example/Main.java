package org.example;

import org.example.controlador.ControladorEspecialidadGUI;
import org.example.modelo.ModeloEspecialidad;
import org.example.vista.VistaEspecialidadGUI;

public class Main {
    public static void main(String[] args) {
        ModeloEspecialidad mp = new ModeloEspecialidad();
        VistaEspecialidadGUI vp = new VistaEspecialidadGUI();
        ControladorEspecialidadGUI cp = new ControladorEspecialidadGUI(mp,vp);
    }
}