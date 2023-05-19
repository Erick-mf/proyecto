/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author Usuario
 */
import java.io.*;

public class ArchivoRegistro {
    private static final String ARCHIVO_REGISTRO = "registro.txt";

    public void guardarRegistro(Object objeto) {
        try (FileWriter writer = new FileWriter(ARCHIVO_REGISTRO, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            if (objeto instanceof Usuario) {
                Usuario usuario = (Usuario) objeto;
                bufferedWriter.write("Usuario," + usuario.getNombreUsuario() + "," + usuario.getContrasenia());
            } else if (objeto instanceof Empleado) {
                Empleado empleado = (Empleado) objeto;
                bufferedWriter.write("Empleado," + empleado.getNombreEmpleado() + "," + empleado.getCargoEmpleado());
            }

            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public boolean verificarCredenciales(String nombreUsuario, String contrasenia) {
        try (FileReader reader = new FileReader(ARCHIVO_REGISTRO);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length == 3 && partes[1].equals(nombreUsuario) && partes[2].equals(contrasenia)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return false;
    }
}
