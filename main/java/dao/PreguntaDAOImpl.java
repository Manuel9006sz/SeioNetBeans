/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Pregunta;
import java.sql.Connection;
import java.util.List;

public class PreguntaDAOImpl implements PreguntaDAO {
    private Connection connection;

    public PreguntaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Pregunta pregunta) {
        // Implementar lógica para crear una Pregunta en la base de datos
    }

    @Override
    public Pregunta read(int id) {
        // Implementar lógica para leer una Pregunta desde la base de datos
        return null;
    }

    @Override
    public void update(Pregunta pregunta) {
        // Implementar lógica para actualizar una Pregunta en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar una Pregunta de la base de datos
    }

    @Override
    public List<Pregunta> findAll() {
        // Implementar lógica para listar todas las Preguntas
        return null;
    }
}
