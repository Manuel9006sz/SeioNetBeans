/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Periodo;
import java.sql.Connection;
import java.util.List;

public class PeriodoDAOImpl implements PeriodoDAO {
    private Connection connection;

    public PeriodoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Periodo periodo) {
        // Implementar lógica para crear un Periodo en la base de datos
    }

    @Override
    public Periodo read(int id) {
        // Implementar lógica para leer un Periodo desde la base de datos
        return null;
    }

    @Override
    public void update(Periodo periodo) {
        // Implementar lógica para actualizar un Periodo en la base de datos
    }

    @Override
    public void delete(int id) {
        // Implementar lógica para eliminar un Periodo de la base de datos
    }

    @Override
    public List<Periodo> findAll() {
        // Implementar lógica para listar todos los Periodos
        return null;
    }
}

