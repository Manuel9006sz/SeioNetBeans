/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seioconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Seioconnection {  // Cambio de nombre de clase

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/seio1";
        String user = "root";  // El usuario por defecto de MySQL en XAMPP es "root"
        String password = "";  // La contraseña suele estar vacía por defecto

        try {
            // Establecer la conexión
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos seio1");

            // Crear un Statement para ejecutar consultas SQL
            Statement statement = connection.createStatement();

            // Aquí puedes ejecutar tus consultas SQL
            // statement.executeUpdate("INSERT INTO ...");
            
            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
