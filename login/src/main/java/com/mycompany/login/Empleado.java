/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private String nombreEmpleado;
    private String cargoEmpleado;

    public Empleado(String nombreEmpleado, String cargoEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }
}

