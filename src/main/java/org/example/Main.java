package org.example;

import org.example.pais.Pais;

import java.sql.*;
import java.util.Scanner;

import static org.example.pais.toolsCRUD.*;

public class Main {

    public static Connection conexion;

    static {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paises", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Qué tipo de operacion quieres hacer: [Consultar] [Añadir] [Actualizar] [Eliminar]");

            String operacion = scanner.nextLine();

            switch (operacion.toLowerCase()) {
                case "consultar":
                    System.out.println("Has seleccionado la operación de consulta.");
                    showPaises();
                    break;

                case "añadir":

                    System.out.println("Has seleccionado la operación de añadir.\n");

                    System.out.println("Dajme el ID\n");
                    int idNew = scanner.nextInt();

                    System.out.println("Dajme el Nombre\n");
                    String nameNew = scanner.nextLine();

                    System.out.println("Dajme el ISO\n");
                    String isoNew = scanner.nextLine();

                    System.out.println("Dajme el nombre de la Capital\n");
                    String capitalNew = scanner.nextLine();

                    System.out.println("Dajme el Nombre de la Región\n");
                    String regionNew = scanner.nextLine();

                    System.out.println("Dajme el Nombre de la Región\n");
                    int poblacionNew = scanner.nextInt();

                    System.out.println("Dajme el Nombre de la Area que ocupa en Km2\n");
                    int areaNew = scanner.nextInt();

                    System.out.println("Dajme el Nombre de la Región\n");
                    int gdpNew = scanner.nextInt();

                    System.out.println("Dajme el Nombre de la Región\n");
                    String monedaNew = scanner.nextLine();

                    Pais newPais = new Pais(idNew, nameNew, isoNew, capitalNew, regionNew, poblacionNew, areaNew, gdpNew, monedaNew  );

                    insertPais(newPais);

                    break;

                case "actualizar":
                    System.out.println("Has seleccionado la operación de actualización.");

                    System.out.println("Dajme el ID del pais para actualizar la poblacion\n");
                    int paisUpdate = scanner.nextInt();

                    System.out.println("Dame el valor de la nueva pobñacion\n");
                    int poblacionUpdate = scanner.nextInt();

                    updatePaisPopulation(poblacionUpdate, paisUpdate);

                    break;

                case "eliminar":
                    System.out.println("Has seleccionado la operación de eliminación.");

                    System.out.println("Dajme el ID del pais para actualizar la poblacion\n");
                    int paisDelete = scanner.nextInt();

                    deletePais(paisDelete);

                    break;

                default:
                    System.out.println("Operación no válida. Por favor, selecciona una opción válida.");
                    break;
            }


            /*
            // Establecer la conexión
            System.out.println("Conexión establecida con éxito.");

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

             */

            /*

             INSERT INTO:

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
            /*

            UPDATE:

            String sqUpdate = "UPDATE paises SET name = ? WHERE country_id = ?";

            PreparedStatement statementUpdate = conexion.prepareStatement(sqUpdate);


            statementUpdate.setString(1, "España Española");
            statementUpdate.setInt(2, 1);

            statementUpdate.executeUpdate();

             */

            /*

            DELETE


            String sqDelete = "DELETE FROM paises WHERE country_id = ?";

            PreparedStatement statementDelete = conexion.prepareStatement(sqDelete);

            statementDelete.setInt(1, 9);
            statementDelete.executeUpdate();

             */


        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }

    }
}
