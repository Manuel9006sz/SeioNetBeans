/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO {
    private Connection connection;

    public PersonaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Persona persona) {
        // Implementar lógica para crear una Persona en la base de datos
    }

    @Override
    public Persona read(int id) {
        // Implementar lógica para leer una Persona desde la base de datos
        return null;
    }

    @Override
    public void update(Persona persona) {
        // Implementar lógica para actualizar una Persona en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar una Persona de la base de datos
    }

    @Override
    public List<Persona> findAll() {
        // Implementar lógica para listar todas las Personas
        return new ArrayList<>();
    }
}

