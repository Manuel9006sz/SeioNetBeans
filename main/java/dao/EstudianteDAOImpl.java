/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Estudiante;
import java.sql.Connection;
import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO {
    private Connection connection;

    public EstudianteDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Estudiante estudiante) {
        // Implementar lógica para crear un Estudiante en la base de datos
    }

    @Override
    public Estudiante read(int id) {
        // Implementar lógica para leer un Estudiante desde la base de datos
        return null;
    }

    @Override
    public void update(Estudiante estudiante) {
        // Implementar lógica para actualizar un Estudiante en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Estudiante de la base de datos
    }

    @Override
    public List<Estudiante> findAll() {
        // Implementar lógica para listar todos los Estudiantes
        return null;
    }
}

