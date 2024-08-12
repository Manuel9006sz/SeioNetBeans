/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Indicador;
import java.sql.Connection;
import java.util.List;

public class IndicadorDAOImpl implements IndicadorDAO {
    private Connection connection;

    public IndicadorDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Indicador indicador) {
        // Implementar lógica para crear un Indicador en la base de datos
    }

    @Override
    public Indicador read(int id) {
        // Implementar lógica para leer un Indicador desde la base de datos
        return null;
    }

    @Override
    public void update(Indicador indicador) {
        // Implementar lógica para actualizar un Indicador en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Indicador de la base de datos
    }

    @Override
    public List<Indicador> findAll() {
        // Implementar lógica para listar todos los Indicadores
        return null;
    }
}

