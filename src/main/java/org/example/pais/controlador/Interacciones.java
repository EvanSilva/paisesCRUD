package org.example.pais.controlador;

import org.example.pais.modelo.Pais;

import java.sql.SQLException;
import java.util.Scanner;

import static org.example.pais.modelo.toolsCRUD.*;

public class Interacciones {

    static Scanner scanner = new Scanner(System.in);

    public static void interfaceConsulta() throws SQLException {

        System.out.println("Has seleccionado la operación de consulta.");
        showPaises();

    }

    public static void interfaceAñadir() throws SQLException {

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

        Pais newPais = new Pais(idNew, nameNew, isoNew, capitalNew, regionNew, poblacionNew, areaNew, gdpNew, monedaNew);

        insertPais(newPais);

    }

    public static void interfaceActualizar() throws SQLException {

        System.out.println("Has seleccionado la operación de actualización.");

        System.out.println("Dajme el ID del pais para actualizar la poblacion\n");
        int paisUpdate = scanner.nextInt();

        System.out.println("Dame el valor de la nueva pobñacion\n");
        int poblacionUpdate = scanner.nextInt();

        updatePaisPopulation(poblacionUpdate, paisUpdate);

    }

    public static void interfaceEliminar() throws SQLException {

        System.out.println("Has seleccionado la operación de eliminación.");

        System.out.println("Dajme el ID del pais para actualizar la poblacion\n");
        int paisDelete = scanner.nextInt();

        deletePais(paisDelete);
    }



}
