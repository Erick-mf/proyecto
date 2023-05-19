/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LoginApp {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArchivoRegistro archivoRegistro = new ArchivoRegistro();

        System.out.println("Bienvenido al sistema de login y registro");

        while (true) {
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Registrar nuevo empleado");
            System.out.println("3. Iniciar sesión");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Registro de nuevo usuario");
                    System.out.print("Ingrese el nombre de usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contrasenia = scanner.nextLine();

                    Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasenia);
                    archivoRegistro.guardarRegistro(nuevoUsuario);
                    System.out.println("Usuario registrado correctamente.");
                    break;
                case 2:
                    System.out.println("Registro de nuevo empleado");
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingrese el cargo del empleado: ");
                    String cargoEmpleado = scanner.nextLine();

                    Empleado nuevoEmpleado = new Empleado(nombreEmpleado, cargoEmpleado);
                    archivoRegistro.guardarRegistro(nuevoEmpleado);
                    System.out.println("Empleado registrado correctamente.");
                    break;
                case 3:
                    System.out.println("Inicio de sesión");
                    System.out.print("Ingrese el nombre de usuario: ");
                    nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    contrasenia = scanner.nextLine();

                    if (archivoRegistro.verificarCredenciales(nombreUsuario, contrasenia)) {
                        System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                    } else {
                        System.out.println("Credenciales incorrectas. No se pudo iniciar sesión.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de login y registro. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}






