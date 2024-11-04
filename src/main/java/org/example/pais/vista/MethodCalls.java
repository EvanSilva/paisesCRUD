package org.example.pais.vista;

import org.example.pais.controlador.Interacciones;
import org.example.pais.modelo.Pais;

import java.sql.SQLException;
import java.util.Scanner;

import static org.example.pais.modelo.toolsCRUD.*;
import static org.example.pais.modelo.toolsCRUD.deletePais;

public class MethodCalls {


    public static void executeBody() {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Qué tipo de operacion quieres hacer: [Consultar] [Añadir] [Actualizar] [Eliminar]\n");

            String operacion = scanner.nextLine();

            switch (operacion.toLowerCase()) {
                case "consultar":

                    Interacciones.interfaceConsulta();

                    break;

                case "añadir":

                    Interacciones.interfaceAñadir();

                    break;

                case "actualizar":

                    Interacciones.interfaceActualizar();

                    break;

                case "eliminar":

                    Interacciones.interfaceEliminar();

                    break;

                default:
                    System.out.println("Operación no válida. Por favor, selecciona una opción válida.");
                    break;
            }


        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }

    }

}
