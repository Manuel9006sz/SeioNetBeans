/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Docente;
import java.sql.Connection;
import java.util.List;

public class DocenteDAOImpl implements DocenteDAO {
    private Connection connection;

    public DocenteDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Docente docente) {
        // Implementar lógica para crear un Docente en la base de datos
    }

    @Override
    public Docente read(int id) {
        // Implementar lógica para leer un Docente desde la base de datos
        return null;
    }

    @Override
    public void update(Docente docente) {
        // Implementar lógica para actualizar un Docente en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Docente de la base de datos
    }

    @Override
    public List<Docente> findAll() {
        // Implementar lógica para listar todos los Docentes
        return null;
    }
}
