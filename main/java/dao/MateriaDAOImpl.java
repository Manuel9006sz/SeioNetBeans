/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAOImpl implements MateriaDAO {
    private Connection connection;

    public MateriaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Materia materia) {
        // Implementar lógica para crear una Materia en la base de datos
    }

    @Override
    public Materia read(int id) {
        // Implementar lógica para leer una Materia desde la base de datos
        return null;
    }

    @Override
    public void update(Materia materia) {
        // Implementar lógica para actualizar una Materia en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar una Materia de la base de datos
    }

    @Override
    public List<Materia> findAll() {
        // Implementar lógica para listar todas las Materias
        return new ArrayList<>();
    }
}
