package org.example.pais.modelo;

import java.sql.*;

public class toolsCRUD {


    public static Connection conexion;

    public static void startConection() {

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paises", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void showPaises() throws SQLException {

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

            System.out.println("La información de " + name + " es: \n\n" +
                    "\t Id: " + id + "\n" +
                    "\t Iso: " + iso + "\n" +
                    "\t Capital: " + capital + "\n" +
                    "\t Region: " + region + "\n" +
                    "\t Poblacion: " + population + "\n" +
                    "\t Km2: " + area + "\n" +
                    "\t GDP: " + gdp + "\n" +
                    "\t Moneda: " + currency + "\n \n"
            );

        }

    }

    public static void insertPais(Pais pais) throws SQLException {

        String sqlInsert = "INSERT INTO paises (country_id, name, iso_code, capital, region, population, area_km2, gdp_per_capita, currency) VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement statementInsert = conexion.prepareStatement(sqlInsert);

        statementInsert.setInt(1, pais.getCountry_id()); // country_id
        statementInsert.setString(2, pais.getName()); // name
        statementInsert.setString(3, pais.getIso()); // iso_code
        statementInsert.setString(4, pais.getCapital()); // capital
        statementInsert.setString(5, pais.getRegion()); // region
        statementInsert.setInt(6, pais.getPopulation()); // population
        statementInsert.setDouble(7, pais.getArea_km2()); // area_km2
        statementInsert.setDouble(8, pais.getGdp_per_capita()); // gdp_per_capita
        statementInsert.setString(9, pais.getCurrency()); // currency

        statementInsert.executeUpdate();

    }

    public static void updatePaisPopulation (int newPopulation, int idPais) throws SQLException {

        String sqUpdate = "UPDATE paises SET population = ? WHERE country_id = ?";

        PreparedStatement statementUpdate = conexion.prepareStatement(sqUpdate);


        statementUpdate.setInt(1, newPopulation);
        statementUpdate.setInt(2, idPais);

        statementUpdate.executeUpdate();

    }

    public static void deletePais(int idPais) throws SQLException {


        String sqDelete = "DELETE FROM paises WHERE country_id = ?";

        PreparedStatement statementDelete = conexion.prepareStatement(sqDelete);

        statementDelete.setInt(1, idPais);
        statementDelete.executeUpdate();
    }







}
