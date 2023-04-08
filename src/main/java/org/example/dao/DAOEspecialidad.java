package org.example.dao;

import org.example.conexion.Conexion;
import org.example.modelo.ModeloEspecialidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOEspecialidad implements DAOGeneral<Integer, ModeloEspecialidad> {
    private Conexion conexion;

    public DAOEspecialidad() {
        conexion = new Conexion();
    }
    @Override
    public boolean agregar(ModeloEspecialidad elemento) {
        if(conexion.abrir()) {
            String sql = "INSERT INTO especialidad(id,nombre) VALUES (?,?)";
            Connection enlace = conexion.obtener();
            try {
                PreparedStatement pstm = enlace.prepareStatement(sql);
                pstm.setInt(1, elemento.getId());
                pstm.setString(2, elemento.getNombre());
                pstm.execute();
                return true;
            } catch (SQLException e) {
                return false;
            }
        }
        return false;
    }
}
