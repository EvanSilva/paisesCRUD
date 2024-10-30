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
                        "Id: " + id + "\n" +
                        "Iso: " + iso + "\n" +
                        "Capital: " + capital + "\n" +
                        "Region: " + region + "\n" +
                        "Poblacion: " + population + "\n" +
                        "Km2: " + area + "\n" +
                        "GDP: " + gdp + "\n" +
                        "Moneda: " + currency + "\n"
                );

            }

            /*

            String sqlInsert = "INSERT INTO paises (country_id, name, iso_code, capital, region, population, area_km2, gdp_per_capita, currency) VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement statementInsert = conexion.prepareStatement(sqlInsert);


            statementInsert.setInt(1, 9); // country_id
            statementInsert.setString(2, "Bután"); // name
            statementInsert.setString(3, "BT"); // iso_code
            statementInsert.setString(4, "Thimphu"); // capital
            statementInsert.setString(5, "Asia"); // region
            statementInsert.setInt(6, 780000); // population
            statementInsert.setDouble(7, 38394.0); // area_km2
            statementInsert.setDouble(8, 2.53); // gdp_per_capita
            statementInsert.setString(9, "ngultrum"); // currency


            statementInsert.executeUpdate();


             */











        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }

    }
}
