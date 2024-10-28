package org.example;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paises", "root", "root");
            System.out.println("Conexión establecida con éxito.");

            // Aquí puedes añadir el código para trabajar con la base de datos

            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT * FROM paises");

            while (resultado.next()) {

                String id = resultado.getString(1);
                String name = resultado.getString(2);
                String iso = resultado.getString(3);
                String capital = resultado.getString(4);
                String region = resultado.getString(5);
                String population = resultado.getString(6);
                String area = resultado.getString(7);
                String gdp = resultado.getString(8);
                String currency = resultado.getString(9);

                System.out.println("La información de " + name + " es: \n" +
                        "id: " + id + "\n" +
                        "iso: " + iso + "\n" +
                        "capital: " + capital + "\n" +
                        "region: " + region + "\n" +
                        "poblacion: " + population + "\n" +
                        "Km2: " + area + "\n" +
                        "GDP: " + gdp + "\n" +
                        "moneda: " + currency + "\n"
                );

            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }

    }
}
