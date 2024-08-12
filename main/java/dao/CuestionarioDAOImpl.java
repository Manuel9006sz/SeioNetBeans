/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Cuestionario;
import java.sql.Connection;
import java.util.List;

public class CuestionarioDAOImpl implements CuestionarioDAO {
    private Connection connection;

    public CuestionarioDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Cuestionario cuestionario) {
        // Implementar lógica para crear un Cuestionario en la base de datos
    }

    @Override
    public Cuestionario read(int id) {
        // Implementar lógica para leer un Cuestionario desde la base de datos
        return null;
    }

    @Override
    public void update(Cuestionario cuestionario) {
        // Implementar lógica para actualizar un Cuestionario en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Cuestionario de la base de datos
    }

    @Override
    public List<Cuestionario> findAll() {
        // Implementar lógica para listar todos los Cuestionarios
        return null;
    }
}

