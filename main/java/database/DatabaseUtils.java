/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseUtils {

    public static void beginTransaction(Connection connection) throws SQLException {
        connection.setAutoCommit(false);
    }

    public static void commitTransaction(Connection connection) throws SQLException {
        connection.commit();
    }

    public static void rollbackTransaction(Connection connection) throws SQLException {
        connection.rollback();
    }
}

