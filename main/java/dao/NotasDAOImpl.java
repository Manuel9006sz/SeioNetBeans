/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Notas;
import java.sql.Connection;
import java.util.List;

public class NotasDAOImpl implements NotasDAO {
    private Connection connection;

    public NotasDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Notas notas) {
        // Implementar lógica para crear una Notas en la base de datos
    }

    @Override
    public Notas read(int id) {
        // Implementar lógica para leer una Notas desde la base de datos
        return null;
    }

    @Override
    public void update(Notas notas) {
        // Implementar lógica para actualizar una Notas en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar una Notas de la base de datos
    }

    @Override
    public List<Notas> findAll() {
        // Implementar lógica para listar todas las Notas
        return null;
    }
}

