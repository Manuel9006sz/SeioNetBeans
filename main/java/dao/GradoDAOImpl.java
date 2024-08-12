/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Grado;
import java.sql.Connection;
import java.util.List;

public class GradoDAOImpl implements GradoDAO {
    private Connection connection;

    public GradoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Grado grado) {
        // Implementar lógica para crear un Grado en la base de datos
    }

    @Override
    public Grado read(int id) {
        // Implementar lógica para leer un Grado desde la base de datos
        return null;
    }

    @Override
    public void update(Grado grado) {
        // Implementar lógica para actualizar un Grado en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Grado de la base de datos
    }

    @Override
    public List<Grado> findAll() {
        // Implementar lógica para listar todos los Grados
        return null;
    }
}
